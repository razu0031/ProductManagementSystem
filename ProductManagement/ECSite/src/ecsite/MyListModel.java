/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsite;

import java.util.List;
import java.util.LinkedList;
import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author razu
 */
public class MyListModel extends AbstractListModel{
    
    private List<String> scnm= new LinkedList<>();
    private List<String> scdc= new LinkedList<>();
    private List<Icon> scic= new LinkedList<>();

    public MyListModel() {
        String e1="razu";
        String e2="habi jabi onek kichu";
        Icon ic=new ImageIcon("C:\\Users\\razu\\Desktop\\myPic.jpg");
        
        scnm.add(e1);
        scdc.add(e2);
        scic.add(ic);
    }

    
    
    @Override
    public int getSize() {
        return scnm.size();
    }

    @Override
    public Object getElementAt(int index) {
        return scnm.get(index);
    }
    
    
    public void addElement(String s1, String s2, Icon ic)
    {
        scnm.add(s1);
        scdc.add(s2);
        scic.add(ic);
        fireContentsChanged(this,0,scnm.size());
    }
    
}
