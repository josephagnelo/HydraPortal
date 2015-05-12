/**
 * 
 */
package com.hydra.services;

import com.hydra.user.entity.Party;
import com.hydra.user.exceptions.PartyException;

/**
 * @author jskariah
 *
 * udpate and delete operations would be atomic in nature. So these method implementations would responsible
 * for roll back of the same.
 */
public interface PartyService {
	
	public Party getPartyByPartyId(String partyId);
	
	public void createParty(Party party);
	
	public void deletePartyByPartyId(String partyId);
	
	public void deleteParty(Party party) throws PartyException;
	
	/* 
	 * Boolean full update would indicate that the properties which are not set should be deleted.
	 */
	public void updateParty(Party party, Boolean fullUpdate) throws PartyException;

}
