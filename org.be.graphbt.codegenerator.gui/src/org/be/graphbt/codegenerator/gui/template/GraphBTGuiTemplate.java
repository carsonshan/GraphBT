package org.be.graphbt.codegenerator.gui.template;

import org.be.graphbt.model.graphbt.*;
import org.eclipse.emf.common.util.*;;

public class GraphBTGuiTemplate
{
  protected static String nl;
  public static synchronized GraphBTGuiTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    GraphBTGuiTemplate result = new GraphBTGuiTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "import java.io.*;" + NL + "import org.eclipse.swt.SWT;" + NL + "import org.eclipse.swt.events.SelectionEvent;" + NL + "import org.eclipse.swt.events.SelectionListener;" + NL + "import org.eclipse.swt.graphics.Image;" + NL + "import org.eclipse.swt.layout.GridData;" + NL + "import org.eclipse.swt.layout.GridLayout;" + NL + "import org.eclipse.swt.widgets.*;" + NL + "" + NL + "public class Public {" + NL + " \tpublic static void main(String[]args) throws IOException {" + NL + "\t \tfinal Display display = new Display();" + NL + "\t\tShell shell = new Shell(display);" + NL + "\t\tshell.setText(\"Hello World\");" + NL + "\t\tfinal Composite comp = new Composite(shell, SWT.NULL);" + NL + "\t\t";
  protected final String TEXT_4 = NL + "\t\t";
  protected final String TEXT_5 = NL + "\t\tFile file";
  protected final String TEXT_6 = " = new File(\"resource/";
  protected final String TEXT_7 = ".jpg\");" + NL + "\t\tImage image";
  protected final String TEXT_8 = " = new Image(display, new FileInputStream(file";
  protected final String TEXT_9 = "));" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t\tfinal Button button";
  protected final String TEXT_11 = " = new Button(comp, SWT.NULL);" + NL + "\t\tbutton";
  protected final String TEXT_12 = ".setImage(image";
  protected final String TEXT_13 = ");" + NL + "\t\tbutton";
  protected final String TEXT_14 = ".setBounds(image";
  protected final String TEXT_15 = ".getBounds());\t" + NL + "\t   \tbutton";
  protected final String TEXT_16 = ".setLocation(";
  protected final String TEXT_17 = ",";
  protected final String TEXT_18 = ");\t" + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\tfinal Label label";
  protected final String TEXT_20 = " = new Label(comp, SWT.NULL);\t" + NL + "\t\tlabel";
  protected final String TEXT_21 = ".setImage(image";
  protected final String TEXT_22 = ");" + NL + "\t\tlabel";
  protected final String TEXT_23 = ".setBounds(image";
  protected final String TEXT_24 = ".getBounds());\t" + NL + "\t   \tlabel";
  protected final String TEXT_25 = ".setLocation(";
  protected final String TEXT_26 = ",";
  protected final String TEXT_27 = ");\t" + NL + "\t   \t";
  protected final String TEXT_28 = NL + "\t\tcomp.pack();" + NL + "\t\tshell.open();" + NL + "\t\twhile(!shell.isDisposed()) {" + NL + "\t\t\tif(!display.readAndDispatch()) {" + NL + "\t\t\t\tdisplay.sleep();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tdisplay.dispose();" + NL + " \t\tSystem.out.println(\"Hello World\");" + NL + " \t}" + NL + " }";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    BEModel model = (BEModel) argument; 
    if(model.getLayoutList()==null) return null;
    stringBuffer.append(TEXT_2);
    EList<Layout> layouts = model.getLayoutList().getLayouts(); 
    stringBuffer.append(TEXT_3);
    for (int i = 0; i < layouts.size(); i++) { 
    stringBuffer.append(TEXT_4);
    Layout l = layouts.get(i);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_9);
    if(l.getCRef().startsWith("CBUTTON")) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(l.getX());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(l.getY());
    stringBuffer.append(TEXT_18);
    } else {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(l.getCRef());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(l.getX());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(l.getY());
    stringBuffer.append(TEXT_27);
    }}
    stringBuffer.append(TEXT_28);
    return stringBuffer.toString();
  }
}
