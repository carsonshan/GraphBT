/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.be.graphbt.codegenerator.absmodel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author Emerson
 */
public class ABSClass implements ABSBlock {
    private ArrayList<ABSInterface> ai = new ArrayList<ABSInterface>();
    private String name;
    private ArrayList<ABSMethodImplementation> methods = null;
    private ArrayList<ABSStatement> statements = new ArrayList<ABSStatement>();
    private ArrayList<ABSParameter> params = null;
    private Set<ABSVariable> vars = new HashSet<ABSVariable>() ;
    private String annotation;
    public ABSClass(ABSInterface ai) {
        this.ai.add(ai);
        if(ai.getMethods().size() > 0) {
            methods = new ArrayList<ABSMethodImplementation>();
        }
    }

    public ABSClass(ABSInterface ai, String n) {
        this.ai.add(ai);
        this.name = n;
    }
    public void setAnnotation(String a) {
        annotation = a;
    }
    
    public String getAnnotation() {
        return annotation;
    }
    
    public ArrayList<ABSInterface> getInterfaces() {
        return ai;
    }
    
    public String getClassName() {
        return name;
    }
    
    public void addParameter(ABSParameter par) {
        if(params == null) {
            params = new ArrayList<ABSParameter>();
        }
        params.add(par);
    }
    public void addMethodImplementation(ABSMethodImplementation mi) {
        if(methods == null) {
            methods = new ArrayList<ABSMethodImplementation>();
        }
        methods.add(mi);
    }
    
    public void addVariable(ABSVariable a) {
        vars.add(a);
    }
    @Override
    public String toString() {
        String temp="";
        if(annotation != null)
        temp = "["+annotation+"]\n";
        temp+="class "+name+"(";
        if(params != null && params.size() > 0) {
            temp+=params.get(0);
            for(int i = 1; i < params.size(); i++) {
                temp += ","+params.get(i).toString();
            }
        }
        
        
        temp+=") implements "+ai.get(0).getName();
        for(int i = 1; i < ai.size(); i++) {
            temp += ","+ai.get(i).getName();
        }
        temp+=" {\n";
        if(vars != null) {
            Iterator<ABSVariable> i = vars.iterator();
            while(i.hasNext()) {
                temp += i.next().toString()+"\n";
            }
        }
        if(statements!= null) {
            for(int i = 0; i < statements.size(); i++) {
                temp += statements.get(i).getStatement()+"\n\n";
            }
        }
        temp+="\n";
        if(methods != null) {
            for(int i = 0; i < methods.size(); i++) {
                temp += methods.get(i).toString()+"\n\n";
            }
        }
        
        temp+="}";
        return temp;
    }
    public String initialize(String varName) {
        return ai.get(0).getName()+" "+varName+" = new "+getClassName()+"()";
    }
    
    public String initialize(String varName,String[]par) {
        String temp = "";
        if(par.length > 0)
            temp = par[0];
        for(int i = 1; i < par.length; i++) {
            temp+=","+par[i];
        }
        return ai.get(0).getName()+" "+varName+" = new "+getClassName()+"("+temp+");";
    }
    
    public void addInterface(ABSInterface ai) {
        this.ai.add(ai);
    }

    @Override
    public void addStatement(ABSStatement a) {
    	statements.add(a);
    }
    public Set<ABSVariable> getVariables() {
        return vars;
    }

    public ArrayList<ABSParameter> getParameters() {
        return params;
    }

    @Override
    public boolean isDeclared(ABSDeclarable a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public ABSMethodImplementation getMethodImplementation(String methodName) {
    	for(ABSMethodImplementation ami:this.methods) {
    		if(ami.getMethodDeclaration().getName().equals(methodName)) {
    			return ami;
    		}
    	}
    	return null;
    }
    public void addAccessorMutator(ABSVariable av) {
    	ABSMethod selector = new ABSMethod(av.getDataType(),"get_"+av.getName());
        ABSMethodImplementation selectorImpl = new ABSMethodImplementation(selector);
        selectorImpl.addStatement(new ABSStatement(ABSStatementType.RETURN, "return "+av.getName()));
        this.getInterfaces().get(0).add(selector);
        this.addMethodImplementation(selectorImpl);
        ArrayList<ABSParameter> params = new ArrayList<ABSParameter>();
        ABSParameter param = new ABSParameter(av.getDataType(), "value");
        params.add(param);
        ABSMethod mutator = new ABSMethod(ABSDataType.UNIT,"set_"+av.getName(),params);
        ABSMethodImplementation mutatorImpl = new ABSMethodImplementation(mutator);
        mutatorImpl.addStatement(new ABSStatement(ABSStatementType.ASSIGNMENT, "this."+av.getName()+" = value"));
        this.getInterfaces().get(0).add(mutator);
        this.addMethodImplementation(mutatorImpl);
    }

	@Override
	public void addStatement(int line, ABSStatement as) {
		this.statements.add(line,as);
	}
}
