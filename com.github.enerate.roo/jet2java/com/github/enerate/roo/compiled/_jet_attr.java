package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attr implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attr() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_7 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_1_96 = new TagInfo("c:choose", //$NON-NLS-1$
            1, 96,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_3_1 = new TagInfo("c:when", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='boolean') or ($type='java.lang.Boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_21 = new TagInfo("c:get", //$NON-NLS-1$
            4, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_56 = new TagInfo("c:if", //$NON-NLS-1$
            4, 56,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_51 = new TagInfo("c:get", //$NON-NLS-1$
            5, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_7_1 = new TagInfo("c:when", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='java.lang.String') or ($type='char') or ($type='java.lang.Character')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_20 = new TagInfo("c:get", //$NON-NLS-1$
            8, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_55 = new TagInfo("c:if", //$NON-NLS-1$
            8, 55,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_51 = new TagInfo("c:get", //$NON-NLS-1$
            9, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_11_1 = new TagInfo("c:when", //$NON-NLS-1$
            11, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='float') or ($type='java.lang.Float') or ($type='double') or ($type='java.lang.Double') or ($type='int') or ($type='java.lang.Integer') or ($type='short') or ($type='java.lang.Short') or ($type='long') or ($type='java.lang.Long')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_20 = new TagInfo("c:get", //$NON-NLS-1$
            12, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_55 = new TagInfo("c:if", //$NON-NLS-1$
            12, 55,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_51 = new TagInfo("c:get", //$NON-NLS-1$
            13, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_13_108 = new TagInfo("c:choose", //$NON-NLS-1$
            13, 108,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_15_1 = new TagInfo("c:when", //$NON-NLS-1$
            15, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='float') or ($type='java.lang.Float')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_16_1 = new TagInfo("c:when", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='double') or ($type='java.lang.Double')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_17_1 = new TagInfo("c:when", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='int') or ($type='java.lang.Integer')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_18_1 = new TagInfo("c:when", //$NON-NLS-1$
            18, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='short') or ($type='java.lang.Short')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_19_1 = new TagInfo("c:when", //$NON-NLS-1$
            19, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='long') or ($type='java.lang.Long')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_12 = new TagInfo("c:if", //$NON-NLS-1$
            20, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@iD = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_23_1 = new TagInfo("c:when", //$NON-NLS-1$
            23, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type='java.util.Date'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_18 = new TagInfo("c:get", //$NON-NLS-1$
            24, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_61 = new TagInfo("c:get", //$NON-NLS-1$
            24, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_84 = new TagInfo("c:if", //$NON-NLS-1$
            24, 84,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_51 = new TagInfo("c:get", //$NON-NLS-1$
            25, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_27_1 = new TagInfo("c:when", //$NON-NLS-1$
            27, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/eLiterals", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_18 = new TagInfo("c:get", //$NON-NLS-1$
            28, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_61 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 61,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eAttribute/eAttributeType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_50 = new TagInfo("c:include", //$NON-NLS-1$
            29, 50,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_124 = new TagInfo("c:get", //$NON-NLS-1$
            29, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_32_1 = new TagInfo("c:when", //$NON-NLS-1$
            32, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@upperBound > 1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_17 = new TagInfo("c:get", //$NON-NLS-1$
            33, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_63 = new TagInfo("c:get", //$NON-NLS-1$
            33, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_96 = new TagInfo("c:get", //$NON-NLS-1$
            33, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/lowerBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_46 = new TagInfo("c:get", //$NON-NLS-1$
            34, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/upperBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_36_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            36, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_37_19 = new TagInfo("c:get", //$NON-NLS-1$
            37, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_62 = new TagInfo("c:get", //$NON-NLS-1$
            37, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_37_85 = new TagInfo("c:if", //$NON-NLS-1$
            37, 85,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_51 = new TagInfo("c:get", //$NON-NLS-1$
            38, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_40_12 = new TagInfo("c:if", //$NON-NLS-1$
            40, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@transient = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_60 = new TagInfo("c:if", //$NON-NLS-1$
            41, 60,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@lowerBound = 1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_42_54 = new TagInfo("c:if", //$NON-NLS-1$
            42, 54,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@upperBound = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_43_59 = new TagInfo("c:setVariable", //$NON-NLS-1$
            43, 59,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_44_41 = new TagInfo("c:include", //$NON-NLS-1$
            44, 41,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("field ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_setVariable_1_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_7.setRuntimeParent(null);
        _jettag_c_setVariable_1_7.setTagInfo(_td_c_setVariable_1_7);
        _jettag_c_setVariable_1_7.doStart(context, out);
        _jettag_c_setVariable_1_7.doEnd();
        RuntimeTagElement _jettag_c_choose_1_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_1_96); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_1_96.setRuntimeParent(null);
        _jettag_c_choose_1_96.setTagInfo(_td_c_choose_1_96);
        _jettag_c_choose_1_96.doStart(context, out);
        JET2Writer _jettag_c_choose_1_96_saved_out = out;
        while (_jettag_c_choose_1_96.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_3_1.setRuntimeParent(_jettag_c_choose_1_96);
            _jettag_c_when_3_1.setTagInfo(_td_c_when_3_1);
            _jettag_c_when_3_1.doStart(context, out);
            JET2Writer _jettag_c_when_3_1_saved_out = out;
            while (_jettag_c_when_3_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("boolean --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_21); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_21.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_4_21.setTagInfo(_td_c_get_4_21);
                _jettag_c_get_4_21.doStart(context, out);
                _jettag_c_get_4_21.doEnd();
                RuntimeTagElement _jettag_c_if_4_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_4_56.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_if_4_56.setTagInfo(_td_c_if_4_56);
                _jettag_c_if_4_56.doStart(context, out);
                while (_jettag_c_if_4_56.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_5_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_5_51.setRuntimeParent(_jettag_c_if_4_56);
                    _jettag_c_get_5_51.setTagInfo(_td_c_get_5_51);
                    _jettag_c_get_5_51.doStart(context, out);
                    _jettag_c_get_5_51.doEnd();
                    _jettag_c_if_4_56.handleBodyContent(out);
                }
                _jettag_c_if_4_56.doEnd();
                _jettag_c_when_3_1.handleBodyContent(out);
            }
            out = _jettag_c_when_3_1_saved_out;
            _jettag_c_when_3_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_7_1.setRuntimeParent(_jettag_c_choose_1_96);
            _jettag_c_when_7_1.setTagInfo(_td_c_when_7_1);
            _jettag_c_when_7_1.doStart(context, out);
            JET2Writer _jettag_c_when_7_1_saved_out = out;
            while (_jettag_c_when_7_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("string --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_20.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_get_8_20.setTagInfo(_td_c_get_8_20);
                _jettag_c_get_8_20.doStart(context, out);
                _jettag_c_get_8_20.doEnd();
                RuntimeTagElement _jettag_c_if_8_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_55.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_if_8_55.setTagInfo(_td_c_if_8_55);
                _jettag_c_if_8_55.doStart(context, out);
                while (_jettag_c_if_8_55.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_51.setRuntimeParent(_jettag_c_if_8_55);
                    _jettag_c_get_9_51.setTagInfo(_td_c_get_9_51);
                    _jettag_c_get_9_51.doStart(context, out);
                    _jettag_c_get_9_51.doEnd();
                    _jettag_c_if_8_55.handleBodyContent(out);
                }
                _jettag_c_if_8_55.doEnd();
                _jettag_c_when_7_1.handleBodyContent(out);
            }
            out = _jettag_c_when_7_1_saved_out;
            _jettag_c_when_7_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_11_1.setRuntimeParent(_jettag_c_choose_1_96);
            _jettag_c_when_11_1.setTagInfo(_td_c_when_11_1);
            _jettag_c_when_11_1.doStart(context, out);
            JET2Writer _jettag_c_when_11_1_saved_out = out;
            while (_jettag_c_when_11_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("number --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_20.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_get_12_20.setTagInfo(_td_c_get_12_20);
                _jettag_c_get_12_20.doStart(context, out);
                _jettag_c_get_12_20.doEnd();
                RuntimeTagElement _jettag_c_if_12_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_12_55.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_if_12_55.setTagInfo(_td_c_if_12_55);
                _jettag_c_if_12_55.doStart(context, out);
                while (_jettag_c_if_12_55.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_51.setRuntimeParent(_jettag_c_if_12_55);
                    _jettag_c_get_13_51.setTagInfo(_td_c_get_13_51);
                    _jettag_c_get_13_51.doStart(context, out);
                    _jettag_c_get_13_51.doEnd();
                    _jettag_c_if_12_55.handleBodyContent(out);
                }
                _jettag_c_if_12_55.doEnd();
                RuntimeTagElement _jettag_c_choose_13_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_13_108); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_13_108.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_choose_13_108.setTagInfo(_td_c_choose_13_108);
                _jettag_c_choose_13_108.doStart(context, out);
                JET2Writer _jettag_c_choose_13_108_saved_out = out;
                while (_jettag_c_choose_13_108.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    // GWT does not currently support primitive types in an entity. 
                    RuntimeTagElement _jettag_c_when_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_15_1.setRuntimeParent(_jettag_c_choose_13_108);
                    _jettag_c_when_15_1.setTagInfo(_td_c_when_15_1);
                    _jettag_c_when_15_1.doStart(context, out);
                    JET2Writer _jettag_c_when_15_1_saved_out = out;
                    while (_jettag_c_when_15_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Float");  //$NON-NLS-1$        
                        _jettag_c_when_15_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_15_1_saved_out;
                    _jettag_c_when_15_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_16_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_16_1.setRuntimeParent(_jettag_c_choose_13_108);
                    _jettag_c_when_16_1.setTagInfo(_td_c_when_16_1);
                    _jettag_c_when_16_1.doStart(context, out);
                    JET2Writer _jettag_c_when_16_1_saved_out = out;
                    while (_jettag_c_when_16_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Double");  //$NON-NLS-1$        
                        _jettag_c_when_16_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_16_1_saved_out;
                    _jettag_c_when_16_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_17_1.setRuntimeParent(_jettag_c_choose_13_108);
                    _jettag_c_when_17_1.setTagInfo(_td_c_when_17_1);
                    _jettag_c_when_17_1.doStart(context, out);
                    JET2Writer _jettag_c_when_17_1_saved_out = out;
                    while (_jettag_c_when_17_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Integer");  //$NON-NLS-1$        
                        _jettag_c_when_17_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_17_1_saved_out;
                    _jettag_c_when_17_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_18_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_18_1.setRuntimeParent(_jettag_c_choose_13_108);
                    _jettag_c_when_18_1.setTagInfo(_td_c_when_18_1);
                    _jettag_c_when_18_1.doStart(context, out);
                    JET2Writer _jettag_c_when_18_1_saved_out = out;
                    while (_jettag_c_when_18_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Short");  //$NON-NLS-1$        
                        _jettag_c_when_18_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_18_1_saved_out;
                    _jettag_c_when_18_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_19_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_19_1.setRuntimeParent(_jettag_c_choose_13_108);
                    _jettag_c_when_19_1.setTagInfo(_td_c_when_19_1);
                    _jettag_c_when_19_1.doStart(context, out);
                    JET2Writer _jettag_c_when_19_1_saved_out = out;
                    while (_jettag_c_when_19_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Long");  //$NON-NLS-1$        
                        _jettag_c_when_19_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_19_1_saved_out;
                    _jettag_c_when_19_1.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_13_108.handleBodyContent(out);
                }
                out = _jettag_c_choose_13_108_saved_out;
                _jettag_c_choose_13_108.doEnd();
                RuntimeTagElement _jettag_c_if_20_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_20_12.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_if_20_12.setTagInfo(_td_c_if_20_12);
                _jettag_c_if_20_12.doStart(context, out);
                while (_jettag_c_if_20_12.okToProcessBody()) {
                    out.write(" --unique");  //$NON-NLS-1$        
                    _jettag_c_if_20_12.handleBodyContent(out);
                }
                _jettag_c_if_20_12.doEnd();
                _jettag_c_when_11_1.handleBodyContent(out);
            }
            out = _jettag_c_when_11_1_saved_out;
            _jettag_c_when_11_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_23_1.setRuntimeParent(_jettag_c_choose_1_96);
            _jettag_c_when_23_1.setTagInfo(_td_c_when_23_1);
            _jettag_c_when_23_1.doStart(context, out);
            JET2Writer _jettag_c_when_23_1_saved_out = out;
            while (_jettag_c_when_23_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("date --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_18.setRuntimeParent(_jettag_c_when_23_1);
                _jettag_c_get_24_18.setTagInfo(_td_c_get_24_18);
                _jettag_c_get_24_18.doStart(context, out);
                _jettag_c_get_24_18.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_61); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_61.setRuntimeParent(_jettag_c_when_23_1);
                _jettag_c_get_24_61.setTagInfo(_td_c_get_24_61);
                _jettag_c_get_24_61.doStart(context, out);
                _jettag_c_get_24_61.doEnd();
                RuntimeTagElement _jettag_c_if_24_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_24_84.setRuntimeParent(_jettag_c_when_23_1);
                _jettag_c_if_24_84.setTagInfo(_td_c_if_24_84);
                _jettag_c_if_24_84.doStart(context, out);
                while (_jettag_c_if_24_84.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_51.setRuntimeParent(_jettag_c_if_24_84);
                    _jettag_c_get_25_51.setTagInfo(_td_c_get_25_51);
                    _jettag_c_get_25_51.doStart(context, out);
                    _jettag_c_get_25_51.doEnd();
                    _jettag_c_if_24_84.handleBodyContent(out);
                }
                _jettag_c_if_24_84.doEnd();
                _jettag_c_when_23_1.handleBodyContent(out);
            }
            out = _jettag_c_when_23_1_saved_out;
            _jettag_c_when_23_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_27_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_27_1.setRuntimeParent(_jettag_c_choose_1_96);
            _jettag_c_when_27_1.setTagInfo(_td_c_when_27_1);
            _jettag_c_when_27_1.doStart(context, out);
            JET2Writer _jettag_c_when_27_1_saved_out = out;
            while (_jettag_c_when_27_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("enum --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_18.setRuntimeParent(_jettag_c_when_27_1);
                _jettag_c_get_28_18.setTagInfo(_td_c_get_28_18);
                _jettag_c_get_28_18.doStart(context, out);
                _jettag_c_get_28_18.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_28_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_61); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_28_61.setRuntimeParent(_jettag_c_when_27_1);
                _jettag_c_setVariable_28_61.setTagInfo(_td_c_setVariable_28_61);
                _jettag_c_setVariable_28_61.doStart(context, out);
                _jettag_c_setVariable_28_61.doEnd();
                out.write("~.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_29_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_29_50.setRuntimeParent(_jettag_c_when_27_1);
                _jettag_c_include_29_50.setTagInfo(_td_c_include_29_50);
                _jettag_c_include_29_50.doStart(context, out);
                _jettag_c_include_29_50.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_29_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_124); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_124.setRuntimeParent(_jettag_c_when_27_1);
                _jettag_c_get_29_124.setTagInfo(_td_c_get_29_124);
                _jettag_c_get_29_124.doStart(context, out);
                _jettag_c_get_29_124.doEnd();
                _jettag_c_when_27_1.handleBodyContent(out);
            }
            out = _jettag_c_when_27_1_saved_out;
            _jettag_c_when_27_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_32_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_32_1.setRuntimeParent(_jettag_c_choose_1_96);
            _jettag_c_when_32_1.setTagInfo(_td_c_when_32_1);
            _jettag_c_when_32_1.doStart(context, out);
            JET2Writer _jettag_c_when_32_1_saved_out = out;
            while (_jettag_c_when_32_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("set --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_17.setRuntimeParent(_jettag_c_when_32_1);
                _jettag_c_get_33_17.setTagInfo(_td_c_get_33_17);
                _jettag_c_get_33_17.doStart(context, out);
                _jettag_c_get_33_17.doEnd();
                out.write(" --element ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_63.setRuntimeParent(_jettag_c_when_32_1);
                _jettag_c_get_33_63.setTagInfo(_td_c_get_33_63);
                _jettag_c_get_33_63.doStart(context, out);
                _jettag_c_get_33_63.doEnd();
                out.write(" --sizeMin ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_96); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_96.setRuntimeParent(_jettag_c_when_32_1);
                _jettag_c_get_33_96.setTagInfo(_td_c_get_33_96);
                _jettag_c_get_33_96.doStart(context, out);
                _jettag_c_get_33_96.doEnd();
                out.write(" --sizeMax ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_46.setRuntimeParent(_jettag_c_when_32_1);
                _jettag_c_get_34_46.setTagInfo(_td_c_get_34_46);
                _jettag_c_get_34_46.doStart(context, out);
                _jettag_c_get_34_46.doEnd();
                _jettag_c_when_32_1.handleBodyContent(out);
            }
            out = _jettag_c_when_32_1_saved_out;
            _jettag_c_when_32_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_otherwise_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_36_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_36_1.setRuntimeParent(_jettag_c_choose_1_96);
            _jettag_c_otherwise_36_1.setTagInfo(_td_c_otherwise_36_1);
            _jettag_c_otherwise_36_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_36_1_saved_out = out;
            while (_jettag_c_otherwise_36_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("other --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_19.setRuntimeParent(_jettag_c_otherwise_36_1);
                _jettag_c_get_37_19.setTagInfo(_td_c_get_37_19);
                _jettag_c_get_37_19.doStart(context, out);
                _jettag_c_get_37_19.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_62); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_62.setRuntimeParent(_jettag_c_otherwise_36_1);
                _jettag_c_get_37_62.setTagInfo(_td_c_get_37_62);
                _jettag_c_get_37_62.doStart(context, out);
                _jettag_c_get_37_62.doEnd();
                RuntimeTagElement _jettag_c_if_37_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_37_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_37_85.setRuntimeParent(_jettag_c_otherwise_36_1);
                _jettag_c_if_37_85.setTagInfo(_td_c_if_37_85);
                _jettag_c_if_37_85.doStart(context, out);
                while (_jettag_c_if_37_85.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_38_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_51.setRuntimeParent(_jettag_c_if_37_85);
                    _jettag_c_get_38_51.setTagInfo(_td_c_get_38_51);
                    _jettag_c_get_38_51.doStart(context, out);
                    _jettag_c_get_38_51.doEnd();
                    _jettag_c_if_37_85.handleBodyContent(out);
                }
                _jettag_c_if_37_85.doEnd();
                _jettag_c_otherwise_36_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_36_1_saved_out;
            _jettag_c_otherwise_36_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            _jettag_c_choose_1_96.handleBodyContent(out);
        }
        out = _jettag_c_choose_1_96_saved_out;
        _jettag_c_choose_1_96.doEnd();
        RuntimeTagElement _jettag_c_if_40_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_40_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_40_12.setRuntimeParent(null);
        _jettag_c_if_40_12.setTagInfo(_td_c_if_40_12);
        _jettag_c_if_40_12.doStart(context, out);
        while (_jettag_c_if_40_12.okToProcessBody()) {
            out.write(" --transient");  //$NON-NLS-1$        
            _jettag_c_if_40_12.handleBodyContent(out);
        }
        _jettag_c_if_40_12.doEnd();
        RuntimeTagElement _jettag_c_if_41_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_60); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_41_60.setRuntimeParent(null);
        _jettag_c_if_41_60.setTagInfo(_td_c_if_41_60);
        _jettag_c_if_41_60.doStart(context, out);
        while (_jettag_c_if_41_60.okToProcessBody()) {
            out.write(" --notNull");  //$NON-NLS-1$        
            _jettag_c_if_41_60.handleBodyContent(out);
        }
        _jettag_c_if_41_60.doEnd();
        RuntimeTagElement _jettag_c_if_42_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_42_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_42_54.setRuntimeParent(null);
        _jettag_c_if_42_54.setTagInfo(_td_c_if_42_54);
        _jettag_c_if_42_54.doStart(context, out);
        while (_jettag_c_if_42_54.okToProcessBody()) {
            out.write(" --nullRequired");  //$NON-NLS-1$        
            _jettag_c_if_42_54.handleBodyContent(out);
        }
        _jettag_c_if_42_54.doEnd();
        RuntimeTagElement _jettag_c_setVariable_43_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_43_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_43_59.setRuntimeParent(null);
        _jettag_c_setVariable_43_59.setTagInfo(_td_c_setVariable_43_59);
        _jettag_c_setVariable_43_59.doStart(context, out);
        _jettag_c_setVariable_43_59.doEnd();
        RuntimeTagElement _jettag_c_include_44_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_44_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_44_41.setRuntimeParent(null);
        _jettag_c_include_44_41.setTagInfo(_td_c_include_44_41);
        _jettag_c_include_44_41.doStart(context, out);
        _jettag_c_include_44_41.doEnd();
        out.write(NL);         
    }
}