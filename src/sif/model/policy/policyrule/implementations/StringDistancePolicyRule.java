package sif.model.policy.policyrule.implementations;

import sif.model.elements.basic.cell.Cell;
import sif.model.policy.policyrule.MonolithicPolicyRule;
import sif.model.policy.policyrule.configuration.ConfigurableParameter;

/***
 * A policy rule to find typos with the help of the string distance
 * 
 * @author Sebastian Beck
 *
 */

public class StringDistancePolicyRule extends MonolithicPolicyRule{
	@ConfigurableParameter(parameterClass = Cell[].class, displayedName = "Ignored Cells.", description = "Defines the cells that should get ignored by the inspection.")
	private Cell[] ignoredCells = {};

	@ConfigurableParameter(parameterClass = Integer.class, displayedName = "Max. Levenshtein.", description = "Defines the max. number of changes  for which a failure should get reported.")
	private Cell[] maxDistance = {};
	
	public StringDistancePolicyRule() {
		super();
		setAuthor("Sebastian Beck");
		setName("Policy Rule: String distance");
		setDescription("Checks with the help of the string distance for typos.");
	}
}
