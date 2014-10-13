//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.13 at 10:47:47 AM CEST 
//


package org.apache.nutch.indexer.domjsoup.rule;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.nutch.indexer.domjsoup.rule package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.nutch.indexer.domjsoup.rule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Parse }
     * 
     */
    public Parse createParse() {
        return new Parse();
    }

    /**
     * Create an instance of {@link TextP }
     * 
     */
    public TextP createTextP() {
        return new TextP();
    }

    /**
     * Create an instance of {@link TextP.DatePattern }
     * 
     */
    public TextP.DatePattern createTextPDatePattern() {
        return new TextP.DatePattern();
    }

    /**
     * Create an instance of {@link Parse.Fields }
     * 
     */
    public Parse.Fields createParseFields() {
        return new Parse.Fields();
    }

    /**
     * Create an instance of {@link Equalcheck }
     * 
     */
    public Equalcheck createEqualcheck() {
        return new Equalcheck();
    }

    /**
     * Create an instance of {@link TextP.Trim }
     * 
     */
    public TextP.Trim createTextPTrim() {
        return new TextP.Trim();
    }

    /**
     * Create an instance of {@link TextP.Replace }
     * 
     */
    public TextP.Replace createTextPReplace() {
        return new TextP.Replace();
    }

    /**
     * Create an instance of {@link TextP.Split }
     * 
     */
    public TextP.Split createTextPSplit() {
        return new TextP.Split();
    }

    /**
     * Create an instance of {@link TextP.Append }
     * 
     */
    public TextP.Append createTextPAppend() {
        return new TextP.Append();
    }

    /**
     * Create an instance of {@link TextP.Substring }
     * 
     */
    public TextP.Substring createTextPSubstring() {
        return new TextP.Substring();
    }

    /**
     * Create an instance of {@link TextP.PercentCalculate }
     * 
     */
    public TextP.PercentCalculate createTextPPercentCalculate() {
        return new TextP.PercentCalculate();
    }

    /**
     * Create an instance of {@link TextP.Contains }
     * 
     */
    public TextP.Contains createTextPContains() {
        return new TextP.Contains();
    }

    /**
     * Create an instance of {@link TextP.DatePattern.IndexDef }
     * 
     */
    public TextP.DatePattern.IndexDef createTextPDatePatternIndexDef() {
        return new TextP.DatePattern.IndexDef();
    }

    /**
     * Create an instance of {@link Parse.Fields.TextProcessAlternativeCheck }
     * 
     */
    public Parse.Fields.TextProcessAlternativeCheck createParseFieldsTextProcessAlternativeCheck() {
        return new Parse.Fields.TextProcessAlternativeCheck();
    }

    /**
     * Create an instance of {@link Parse.Fields.NothingFoundAction }
     * 
     */
    public Parse.Fields.NothingFoundAction createParseFieldsNothingFoundAction() {
        return new Parse.Fields.NothingFoundAction();
    }

    /**
     * Create an instance of {@link Parse.Fields.MoveToParent }
     * 
     */
    public Parse.Fields.MoveToParent createParseFieldsMoveToParent() {
        return new Parse.Fields.MoveToParent();
    }

    /**
     * Create an instance of {@link Parse.Fields.Elastic }
     * 
     */
    public Parse.Fields.Elastic createParseFieldsElastic() {
        return new Parse.Fields.Elastic();
    }

    /**
     * Create an instance of {@link Parse.Fields.Joinfields }
     * 
     */
    public Parse.Fields.Joinfields createParseFieldsJoinfields() {
        return new Parse.Fields.Joinfields();
    }

    /**
     * Create an instance of {@link Parse.Fields.TextProcessAlternative }
     * 
     */
    public Parse.Fields.TextProcessAlternative createParseFieldsTextProcessAlternative() {
        return new Parse.Fields.TextProcessAlternative();
    }

    /**
     * Create an instance of {@link Parse.Fields.ConvertToType }
     * 
     */
    public Parse.Fields.ConvertToType createParseFieldsConvertToType() {
        return new Parse.Fields.ConvertToType();
    }

}
