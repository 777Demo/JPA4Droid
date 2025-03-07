package javax.persistence;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Used in the mapping of associations. It is specified on the owning side of an association.
 * 
 * <p>
 * A join table is typically used in the mapping of many-to-many and unidirectional one-to-many associations. It may also be used to map
 * bidirectional many-to-one/one-to-many associations, unidirectional many-to-one relationships, and one-to-one associations (both
 * bidirectional and unidirectional).
 * 
 * <p>
 * When a join table is used in mapping a relationship with an embeddable class on the owning side of the relationship, the containing
 * entity rather than the embeddable class is considered the owner of the relationship.
 * 
 * <p>
 * If the <code>JoinTable</code> annotation is missing, the default values of the annotation elements apply. The name of the join table is
 * assumed to be the table names of the associated primary tables concatenated together (owning side first) using an underscore.
 * 
 * <pre>
 * 
 *    Example:
 * 
 *    &#064;JoinTable(
 *        name="CUST_PHONE",
 *        joinColumns=
 *            &#064;JoinColumn(name="CUST_ID", referencedColumnName="ID"),
 *        inverseJoinColumns=
 *            &#064;JoinColumn(name="PHONE_ID", referencedColumnName="ID")
 *    )
 * </pre>
 * 
 * @see JoinColumn
 * @see JoinColumns
 * 
 * @since Java Persistence 1.0
 */
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface JoinTable {

	/**
	 * (Optional) The catalog of the table.
	 * <p>
	 * Defaults to the default catalog.
	 */
	String catalog() default "";

	/**
	 * (Optional) The foreign key columns of the join table which reference the primary table of the entity that does not own the
	 * association. (I.e. the inverse side of the association).
	 * 
	 * <p>
	 * Uses the same defaults as for {@link JoinColumn}.
	 */
	JoinColumn[] inverseJoinColumns() default {};

	/**
	 * (Optional) The foreign key columns of the join table which reference the primary table of the entity owning the association. (I.e.
	 * the owning side of the association).
	 * 
	 * <p>
	 * Uses the same defaults as for {@link JoinColumn}.
	 */
	JoinColumn[] joinColumns() default {};

	/**
	 * (Optional) The name of the join table.
	 * 
	 * <p>
	 * Defaults to the concatenated names of the two associated primary entity tables, separated by an underscore.
	 */
	String name() default "";

	/**
	 * (Optional) The schema of the table.
	 * <p>
	 * Defaults to the default schema for user.
	 */
	String schema() default "";

	/**
	 * (Optional) Unique constraints that are to be placed on the table. These are only used if table generation is in effect.
	 * <p>
	 * Defaults to no additional constraints.
	 */
	UniqueConstraint[] uniqueConstraints() default {};
}
