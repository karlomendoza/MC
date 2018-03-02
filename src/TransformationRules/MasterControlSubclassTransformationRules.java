package TransformationRules;

public class MasterControlSubclassTransformationRules {

	public static String subClassTransformation(String masterControlInfoType, String masterControlSubType,
			String document) {

		if (masterControlInfoType.equalsIgnoreCase("Automation & Fixtures")
				&& masterControlSubType.equalsIgnoreCase("Component"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Automation & Fixtures")
				&& masterControlSubType.equalsIgnoreCase("Auto Maint Procedure"))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Automation & Fixtures")
				&& masterControlSubType.equalsIgnoreCase("Fixtures"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Automation & Fixtures")
				&& masterControlSubType.equalsIgnoreCase("Automation Process (APLS)"))
			return "Production Method - APLS - Automation Process Limit Sheet";

		else if (masterControlInfoType.equalsIgnoreCase("Automation & Fixtures")
				&& masterControlSubType.equalsIgnoreCase("Asset"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Automation & Fixtures")
				&& masterControlSubType.equalsIgnoreCase(""))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Quality Agreement"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Post Market Data Analysis"))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Tech Sheet"))
			return "Quality System Record - Other";
		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Clinical Evaluation Rpt"))
			return "Quality System Record - Other";
		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Audit Schedule"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Technical File"))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Marketing Literature"))
			return "Product Packaging, Labeling, and Manuals - Printed Material Summary";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Management Review"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate")
				&& masterControlSubType.equalsIgnoreCase("Essential Req Checklist"))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate") && masterControlSubType.equalsIgnoreCase(""))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control")
				&& masterControlSubType.equalsIgnoreCase("Baseline Risk Analysis"))
			return "Risk Management - Risk Management Report";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control")
				&& masterControlSubType.equalsIgnoreCase("Risk Assessment -Rel Prod"))
			return "Risk Management - Post Market Risk Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control")
				&& masterControlSubType.equalsIgnoreCase("Engineering Specification"))
			return "Spec - Performance Specification";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control")
				&& masterControlSubType.equalsIgnoreCase("Design Plan"))
			return "Design Project Record - Planning Document - Design and Development Plan";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control")
				&& masterControlSubType.equalsIgnoreCase("Traceability Matrix"))
			return "Design Trace";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control")
				&& masterControlSubType.equalsIgnoreCase("Intermediate Risk Mgmt"))
			return "Risk Management - Risk Management Report";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control") && masterControlSubType.equalsIgnoreCase(""))
			return "Manual review";

		else if (masterControlInfoType.equalsIgnoreCase("Engineering Evaluation")
				&& masterControlSubType.equalsIgnoreCase(""))
			return "Manual review";

		else if (masterControlInfoType.equalsIgnoreCase("Legacy")
				&& masterControlSubType.equalsIgnoreCase("Legacy Training"))
			return "Do not migrate";
		else if (masterControlInfoType.equalsIgnoreCase("Legacy")
				&& masterControlSubType.equalsIgnoreCase("Legacy Workflows"))
			return "Do not migrate";

		else if (masterControlInfoType.equalsIgnoreCase("Letter to File")
				&& masterControlSubType.equalsIgnoreCase("Regulatory Letter to File"))
			return "Global Regulatory Assessment";
		else if (masterControlInfoType.equalsIgnoreCase("Letter to File")
				&& masterControlSubType.equalsIgnoreCase("ZZ Letter To File"))
			return "Global Regulatory Assessment";
		else if (masterControlInfoType.equalsIgnoreCase("Letter to File") && masterControlSubType.equalsIgnoreCase(""))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Mold Tooling")
				&& masterControlSubType.equalsIgnoreCase("Asset"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";
		else if (masterControlInfoType.equalsIgnoreCase("Mold Tooling")
				&& masterControlSubType.equalsIgnoreCase("Component"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Mold Tooling")
				&& masterControlSubType.equalsIgnoreCase("Mold Process (MPLS)"))
			return "Production Method - MPLS - Mold Process Limit Sheet";

		else if (masterControlInfoType.equalsIgnoreCase("Mold Tooling") && masterControlSubType.equalsIgnoreCase(""))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Extrusion Instructions"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Misc Labels Printed Forms"))
			return "Product Packaging, Labeling, and Manuals - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Bacterial Endotoxin"))
			return "Test Method - Microbiologic";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Reference Material"))
			return "Design Input - Supporting Evidence";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Sterilization Inst"))
			return "Production Method - Sterilization Instr/Loading Patterns";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Eng Work Order EWO"))
			return "Design Project Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Architecture Document"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Biocompatibility"))
			return "Test Method - Biologic";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Product Hold"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Other") && masterControlSubType.equalsIgnoreCase("CSA"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Other")
				&& masterControlSubType.equalsIgnoreCase("Environmental"))
			return "Spec - Environmental Specification";
		else if (masterControlInfoType.equalsIgnoreCase("Other") && masterControlSubType.equalsIgnoreCase(""))
			return "Quality Reference and Standard";

		else if (masterControlInfoType.equalsIgnoreCase("Procedure")
				&& masterControlSubType.equalsIgnoreCase("General Procedure"))
			return "Quality System Procedure";
		else if (masterControlInfoType.equalsIgnoreCase("Procedure")
				&& masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Quality System Procedure";
		else if (masterControlInfoType.equalsIgnoreCase("Procedure") && masterControlSubType.equalsIgnoreCase("Matrix"))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Procedure")
				&& masterControlSubType.equalsIgnoreCase("Work Instruction"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Procedure") && masterControlSubType.equalsIgnoreCase("Form"))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Procedure") && masterControlSubType.equalsIgnoreCase(""))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Boundary Sample"))
			return "Spec - Test and Inspection Specification";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Software (code)"))
			return "I was told these will get migrated to part records";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Drawing (Make-Buy)"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("IPS Instructions"))
			return "Production Method - Production Line Setup Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Product Specification"))
			return "Spec - Performance Specification";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Customer Owned"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Labeling and DFU") && document.startsWith("BL-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Labeling and DFU") && document.startsWith("IS-"))
			return "Product Packaging, Labeling, and Manuals - Specification";
		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Labeling and DFU") && document.startsWith("MC-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Labeling and DFU") && document.startsWith("PHD-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Labeling and DFU") && document.startsWith("PM-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Labeling and DFU") && document.startsWith("R1-XXXXX-ART"))
			return "Product Packaging, Labeling, and Manuals - Artwork";
		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Labeling and DFU"))
			return "Product Packaging, Labeling, and Manuals - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Standard Test Method"))
			return "Test Method - Functional";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Mfg Work Instruction"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Source Control"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Product Spec Test Method"))
			return "Test Method - Functional";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("SOP Instructions"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Specification Control"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase("Mfg Work Instruction Form"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific")
				&& masterControlSubType.equalsIgnoreCase(""))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Prototype")
				&& masterControlSubType.equalsIgnoreCase("Prototype V1-VT"))
			return "Spec - Drawing/Part/Assembly";
		else if (masterControlInfoType.equalsIgnoreCase("Prototype") && masterControlSubType.equalsIgnoreCase(""))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Template") && masterControlSubType.equalsIgnoreCase(""))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Validation")
				&& masterControlSubType.equalsIgnoreCase("Revalidation 3-year"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Validation")
				&& masterControlSubType.equalsIgnoreCase("Revalidation 5-year"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Validation")
				&& masterControlSubType.equalsIgnoreCase("Software (quality system)"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Validation")
				&& masterControlSubType.equalsIgnoreCase("Revalidation 1-year"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Validation")
				&& masterControlSubType.equalsIgnoreCase("Revalidation Not Required"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Validation") && masterControlSubType.equalsIgnoreCase(""))
			return "Verification, Validation, and Qualification";

		else if (masterControlInfoType.equalsIgnoreCase("Work Order Process")
				&& masterControlSubType.equalsIgnoreCase(""))
			return "Spec - Other";

		return "";
	}
}
