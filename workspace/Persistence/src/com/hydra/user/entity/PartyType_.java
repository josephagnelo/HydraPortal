package com.hydra.user.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-21T23:14:08.555-0500")
@StaticMetamodel(PartyType.class)
public class PartyType_ {
	public static volatile SingularAttribute<PartyType, String> partyTypeCode;
	public static volatile SingularAttribute<PartyType, String> partyTypeDesc;
	public static volatile ListAttribute<PartyType, Party> parties;
}
