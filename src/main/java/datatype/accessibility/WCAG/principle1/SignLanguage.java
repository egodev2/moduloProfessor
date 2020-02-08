package datatype.accessibility.WCAG.principle1;

import database.CriteriaDatabase;
import datatype.Image;
import datatype.accessibility.AbstractCriteria;
import datatype.accessibility.ConformanceLevel;

public class SignLanguage extends AbstractCriteria {

    public SignLanguage()
    {
        super(CriteriaDatabase.CriteriaConstants.SignLanguage,
                CriteriaDatabase.CriteriaConstants.SignLanguageName,
                CriteriaDatabase.CriteriaConstants.SignLanguageDescription);
        super.conformanceLevel = ConformanceLevel.AAA;
    }
    /* VIDEO ONLY
     * TRUE: No videos OR if Video has sign languiange itnerpreter
     * FALSE: Missing key parts of content
     */
    public boolean checkIsSufficient(Image image)
    {
        // Is there a text associated with this image? (Extractor should ahve done this)
        // YES -> true
        // NO -> False.
        return true;
    }
}
