/**
 * 
 */
package com.hydra.services.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

import com.hydra.services.PartyService;
import com.hydra.user.entity.Party;
import com.hydra.user.exceptions.PartyException;

/**
 * @author jskariah
 *
 */

public class PartyServiceImpl implements PartyService {
	
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.hydra.services.PartyService#getPartyByPartyId(java.lang.String)
	 */
	@Override
	public Party getPartyByPartyId(String partyId) {
		if(null != entityManager)
		{
			
			try {
				Party party = entityManager.find(Party.class, partyId);
				return party;
			} catch (EntityNotFoundException e) {
				//TODO - Add entity not found exception logging.
				e.printStackTrace();
			}
		}
		else
		{
			//TODO - Add logging.
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hydra.services.PartyService#createParty(com.hydra.user.entity.Party)
	 */
	@Override
	public void createParty(Party party) {
		if(null != entityManager)
		{
			entityManager.persist(party);
		}
		else
		{
			//TODO - Add logging.
		}

	}

	/* (non-Javadoc)
	 * @see com.hydra.services.PartyService#deletePartyByPartyId(java.lang.String)
	 */
	@Override
	public void deletePartyByPartyId(String partyId) {
		if(null != entityManager)
		{
			entityManager.getTransaction().begin();
			Party party = new Party();
			party.setPartyId(partyId);
			entityManager.remove(party);
			entityManager.getTransaction().commit();
		}
		else
		{
			//TODO - Add logging
		}

	}

	/* (non-Javadoc)
	 * @see com.hydra.services.PartyService#deleteParty(com.hydra.user.entity.Party)
	 */
	@Override
	public void deleteParty(Party party) throws PartyException {
		
		if(null != party)
		{
			if(null != party.getPartyId())
			{
				deletePartyByPartyId(party.getPartyId());
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.hydra.services.PartyService#updateParty(com.hydra.user.entity.Party, java.lang.Boolean)
	 */
	@Override
	public void updateParty(Party party, Boolean fullUpdate)
			throws PartyException {
		// full update woudl replace the whole party
		if(fullUpdate)
		{
			//tempParty = party.clone();
			Boolean removalSuccess = Boolean.FALSE;
			Boolean insertSuccess = Boolean.FALSE;
			Party partyToBeRemoved = null;
			try
			{
				entityManager.getTransaction().begin();
				partyToBeRemoved = entityManager.getReference(Party.class, party.getPartyId());
				entityManager.remove(partyToBeRemoved);
				entityManager.getTransaction().commit();
				removalSuccess = Boolean.TRUE;
				entityManager.getTransaction().begin();
				entityManager.merge(party);
				entityManager.getTransaction().commit();
				insertSuccess = Boolean.TRUE;
			}
			catch(EntityNotFoundException e)
			{
				// TODO - Add logging as an error 
			}
			finally
			{
				if(insertSuccess)
				{
					//TODO - Add logging - all well and good.
				}
				else
				{
					// if not success roll back the current transaction
					if(entityManager.getTransaction().isActive())
					{
						entityManager.getTransaction().rollback();
					}
					// roll back the transaction and reinsert the old record.
					if(removalSuccess)
					{
						entityManager.persist(partyToBeRemoved);
					}
				}
			}
		}
		else
		{
			
		}

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}