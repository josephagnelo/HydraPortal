package com.hydra.user.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-21T23:14:08.518-0500")
@StaticMetamodel(Party.class)
public class Party_ {
	public static volatile SingularAttribute<Party, String> partyId;
	public static volatile SingularAttribute<Party, Date> lastModTime;
	public static volatile SingularAttribute<Party, String> partyDbaName;
	public static volatile SingularAttribute<Party, String> partyFirstName;
	public static volatile SingularAttribute<Party, String> partyLastName;
	public static volatile SingularAttribute<Party, String> partyLegalName;
	public static volatile SingularAttribute<Party, PartyType> partyType;
}
