package TransformationRules;

public class MasterControlSubclassTransformationRules {

	public static String subClassTransformation(String masterControlInfoType, String masterControlSubType, String document) {

		if (masterControlInfoType.equalsIgnoreCase("Component") && masterControlSubType.equalsIgnoreCase("Automation & Fixtures"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Auto Maint Procedure") && masterControlSubType.equalsIgnoreCase("Automation & Fixtures"))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Fixtures") && masterControlSubType.equalsIgnoreCase("Automation & Fixtures"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Automation Process (APLS)") && masterControlSubType.equalsIgnoreCase("Automation & Fixtures"))
			return "Production Method - APLS - Automation Process Limit Sheet";

		else if (masterControlInfoType.equalsIgnoreCase("Asset") && masterControlSubType.equalsIgnoreCase("Automation & Fixtures"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Automation & Fixtures") && masterControlSubType.equalsIgnoreCase(""))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Quality Agreement") && masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Post Market Data Analysis") && masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Tech Sheet") && masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Quality System Record - Other";
		else if (masterControlInfoType.equalsIgnoreCase("Corporate") && masterControlSubType.equalsIgnoreCase("Clinical Evaluation Rpt"))
			return "Quality System Record - Other";
		else if (masterControlInfoType.equalsIgnoreCase("Audit Schedule") && masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Technical File") && masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Marketing Literature") && masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Product Packaging, Labeling, and Manuals - Printed Material Summary";

		else if (masterControlInfoType.equalsIgnoreCase("Management Review") && masterControlSubType.equalsIgnoreCase("Corporate"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate") && masterControlSubType.equalsIgnoreCase("Essential Req Checklist"))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Corporate") && masterControlSubType.equalsIgnoreCase(""))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Baseline Risk Analysis") && masterControlSubType.equalsIgnoreCase("Design Control"))
			return "Risk Management - Risk Management Report";

		else if (masterControlInfoType.equalsIgnoreCase("Risk Assessment -Rel Prod") && masterControlSubType.equalsIgnoreCase("Design Control"))
			return "Risk Management - Post Market Risk Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Engineering Specification") && masterControlSubType.equalsIgnoreCase("Design Control"))
			return "Spec - Performance Specification";

		else if (masterControlInfoType.equalsIgnoreCase("Design Plan") && masterControlSubType.equalsIgnoreCase("Design Control"))
			return "Design Project Record - Planning Document - Design and Development Plan";

		else if (masterControlInfoType.equalsIgnoreCase("Traceability Matrix") && masterControlSubType.equalsIgnoreCase("Design Control"))
			return "Design Trace";

		else if (masterControlInfoType.equalsIgnoreCase("Intermediate Risk Mgmt") && masterControlSubType.equalsIgnoreCase("Design Control"))
			return "Risk Management - Risk Management Report";

		else if (masterControlInfoType.equalsIgnoreCase("Design Control") && masterControlSubType.equalsIgnoreCase(""))
			return "Design Project Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Engineering Evaluation") && masterControlSubType.equalsIgnoreCase(""))
			return "Design Project Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Legacy") && masterControlSubType.equalsIgnoreCase("Legacy Training"))
			return "Do not migrate";
		else if (masterControlInfoType.equalsIgnoreCase("Legacy") && masterControlSubType.equalsIgnoreCase("Legacy Workflows"))
			return "Do not migrate";

		else if (masterControlInfoType.equalsIgnoreCase("Regulatory Letter to File") && masterControlSubType.equalsIgnoreCase("Letter to File"))
			return "Global Regulatory Assessment";
		else if (masterControlInfoType.equalsIgnoreCase("ZZ Letter To File") && masterControlSubType.equalsIgnoreCase("Letter to File"))
			return "Global Regulatory Assessment";
		else if (masterControlInfoType.equalsIgnoreCase("Letter to File") && masterControlSubType.equalsIgnoreCase(""))
			return "Global Regulatory Assessment";

		else if (masterControlInfoType.equalsIgnoreCase("Asset") && masterControlSubType.equalsIgnoreCase("Mold Tooling"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";
		else if (masterControlInfoType.equalsIgnoreCase("Component") && masterControlSubType.equalsIgnoreCase("Mold Tooling"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Mold Process (MPLS)") && masterControlSubType.equalsIgnoreCase("Mold Tooling"))
			return "Production Method - MPLS - Mold Process Limit Sheet";

		else if (masterControlInfoType.equalsIgnoreCase("Mold Tooling") && masterControlSubType.equalsIgnoreCase(""))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Extrusion Instructions") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Misc Labels Printed Forms") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Product Packaging, Labeling, and Manuals - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Bacterial Endotoxin") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Test Method - Microbiologic";

		else if (masterControlInfoType.equalsIgnoreCase("Reference Material") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Design Input - Supporting Evidence";

		else if (masterControlInfoType.equalsIgnoreCase("Sterilization Inst") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Production Method - Sterilization Instr/Loading Patterns";

		else if (masterControlInfoType.equalsIgnoreCase("Eng Work Order EWO") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Design Project Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Architecture Document") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Equipment, Facility, and Utility (EFU) - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Biocompatibility") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Test Method - Biologic";

		else if (masterControlInfoType.equalsIgnoreCase("Product Hold") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("CSA") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Quality System Record - Other";

		else if (masterControlInfoType.equalsIgnoreCase("Environmental") && masterControlSubType.equalsIgnoreCase("Other"))
			return "Spec - Environmental Specification";
		else if (masterControlInfoType.equalsIgnoreCase("Other") && masterControlSubType.equalsIgnoreCase(""))
			return "Quality Reference and Standard";

		else if (masterControlInfoType.equalsIgnoreCase("General Procedure") && masterControlSubType.equalsIgnoreCase("Procedure"))
			return "Quality System Procedure";
		else if (masterControlInfoType.equalsIgnoreCase("Corporate") && masterControlSubType.equalsIgnoreCase("Procedure"))
			return "Quality System Procedure";
		else if (masterControlInfoType.equalsIgnoreCase("Matrix") && masterControlSubType.equalsIgnoreCase("Procedure"))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Work Instruction") && masterControlSubType.equalsIgnoreCase("Procedure"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Form") && masterControlSubType.equalsIgnoreCase("Procedure"))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Procedure") && masterControlSubType.equalsIgnoreCase(""))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Boundary Sample") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Spec - Test and Inspection Specification";

		else if (masterControlInfoType.equalsIgnoreCase("Software (code)") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "I was told these will get migrated to part records";

		else if (masterControlInfoType.equalsIgnoreCase("Drawing (Make-Buy)") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("IPS Instructions") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Production Method - Production Line Setup Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specification") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Spec - Performance Specification";

		else if (masterControlInfoType.equalsIgnoreCase("Customer Owned") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Labeling and DFU") && masterControlSubType.equalsIgnoreCase("Product Specific")
				&& document.startsWith("BL-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Labeling and DFU") && masterControlSubType.equalsIgnoreCase("Product Specific")
				&& document.startsWith("IS-"))
			return "Product Packaging, Labeling, and Manuals - Specification";
		else if (masterControlInfoType.equalsIgnoreCase("Labeling and DFU") && masterControlSubType.equalsIgnoreCase("Product Specific")
				&& document.startsWith("MC-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Labeling and DFU") && masterControlSubType.equalsIgnoreCase("Product Specific")
				&& document.startsWith("PHD-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Labeling and DFU") && masterControlSubType.equalsIgnoreCase("Product Specific")
				&& document.startsWith("PM-"))
			return "Product Packaging, Labeling, and Manuals - Template/Print on Demand";
		else if (masterControlInfoType.equalsIgnoreCase("Labeling and DFU") && masterControlSubType.equalsIgnoreCase("Product Specific")
				&& document.startsWith("R1-XXXXX-ART"))
			return "Product Packaging, Labeling, and Manuals - Artwork";
		else if (masterControlInfoType.equalsIgnoreCase("Labeling and DFU") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Product Packaging, Labeling, and Manuals - Drawing";

		else if (masterControlInfoType.equalsIgnoreCase("Standard Test Method") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Test Method - Functional";

		else if (masterControlInfoType.equalsIgnoreCase("Mfg Work Instruction") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Source Control") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Product Spec Test Method") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Test Method - Functional";

		else if (masterControlInfoType.equalsIgnoreCase("SOP Instructions") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Specification Control") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Mfg Work Instruction Form") && masterControlSubType.equalsIgnoreCase("Product Specific"))
			return "Production Method - Manufacturing Work Instructions";

		else if (masterControlInfoType.equalsIgnoreCase("Product Specific") && masterControlSubType.equalsIgnoreCase(""))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Prototype V1-VT") && masterControlSubType.equalsIgnoreCase("Prototype"))
			return "Spec - Drawing/Part/Assembly";
		else if (masterControlInfoType.equalsIgnoreCase("Prototype") && masterControlSubType.equalsIgnoreCase(""))
			return "Spec - Drawing/Part/Assembly";

		else if (masterControlInfoType.equalsIgnoreCase("Template") && masterControlSubType.equalsIgnoreCase(""))
			return "Quality System Procedure";

		else if (masterControlInfoType.equalsIgnoreCase("Revalidation 3-year") && masterControlSubType.equalsIgnoreCase("Validation"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Revalidation 5-year") && masterControlSubType.equalsIgnoreCase("Validation"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Software (quality system)") && masterControlSubType.equalsIgnoreCase("Validation"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Revalidation 1-year") && masterControlSubType.equalsIgnoreCase("Validation"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Revalidation Not Required") && masterControlSubType.equalsIgnoreCase("Validation"))
			return "Verification, Validation, and Qualification";
		else if (masterControlInfoType.equalsIgnoreCase("Validation") && masterControlSubType.equalsIgnoreCase(""))
			return "Verification, Validation, and Qualification";

		else if (masterControlInfoType.equalsIgnoreCase("Work Order Process") && masterControlSubType.equalsIgnoreCase(""))
			return "Production Method - Manufacturing Work Instructions";

		return "";
	}
}
