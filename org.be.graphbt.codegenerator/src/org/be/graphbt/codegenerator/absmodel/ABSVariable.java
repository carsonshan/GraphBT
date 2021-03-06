/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.be.graphbt.codegenerator.absmodel;

/**
 *
 * @author Emerson
 */
public class ABSVariable implements ABSDeclarable{
    private ABSDataType dataType = ABSDataType.UNIT;
    private String var;
    private String val = null;
    private ABSClass comp;
    
    public ABSVariable(String var) {
        this.var = var;
    }
    
    public ABSVariable(ABSDataType dp, String var) {
        dataType = dp;
        this.var = var;
    }
    
    public ABSVariable(ABSClass c,ABSDataType dp, String var, String init) {
        dataType = dp;
        this.var = var;
        val = init;
        comp = c;
    }
    
    public void setDataType(ABSDataType dp) {
        dataType = dp;
    }
    public void setVarName(String v) {
        var = v;
    }
    public void setValue(String v) {
        val = v;
    }
    public void setComponent(ABSClass dp) {
        comp = dp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (this.var != null ? this.var.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if(o!=null && o instanceof ABSVariable) {
            ABSVariable k = (ABSVariable)o;
            return k.getName().equals(getName());
        }
        return false;
    }
    @Override
    public ABSDataType getDataType() {
        return this.dataType;
    }

    @Override
    public String getName() {
        return this.var;
    }
    @Override
    public String toString() {
        String value = (val==null?dataType.getDefaultValue():val);
        return dataType.getName()+" "+var+" = "+value+";";
    }
}
