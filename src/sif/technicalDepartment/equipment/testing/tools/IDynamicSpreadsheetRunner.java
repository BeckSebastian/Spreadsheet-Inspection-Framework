package sif.technicalDepartment.equipment.testing.tools;

import org.apache.poi.ss.usermodel.Workbook;

import sif.IO.spreadsheet.InvalidSpreadsheetFileException;
import sif.model.elements.basic.spreadsheet.Spreadsheet;
import sif.model.policy.policyrule.DynamicPolicyRule;

public interface IDynamicSpreadsheetRunner {
	
	/**
	 * Writes the {@link TestInput} objects contained in the rule and returns a @return
	 * @return The spreadsheet with the TestInputs but not evaluated formulae
	 * @throws InvalidSpreadsheetFileException 
	 */
	public Spreadsheet prepare(DynamicPolicyRule rule, Object spreadsheet) throws InvalidSpreadsheetFileException;

	/**
	 * Evaluates the prepared workbook
	 * 
	 * @param testWorkbook
	 * @return The spreadsheet with evaluated formulae
	 */
	public Spreadsheet evaluate();
}
