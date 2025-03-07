/*
 * Copyright (c) 2008, 2009 Sun Microsystems. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Linda DeMichiel - Java Persistence 2.0 - Version 2.0 (October 1, 2009)
 *     Specification available from http://jcp.org/en/jsr/detail?id=317
 */

// $Id: PersistenceUnitTransactionType.java 20957 2011-06-13 09:58:51Z stliu $

package javax.persistence.spi;

/**
 * Specifies whether entity managers created by the {@link javax.persistence.EntityManagerFactory} will be JTA or
 * resource-local entity managers.
 * 
 * @since Java Persistence 1.0
 */
public enum PersistenceUnitTransactionType {
	/**
	 * JTA entity managers will be created.
	 */
	JTA,

	/**
	 * Resource-local entity managers will be created.
	 */
	RESOURCE_LOCAL
}
