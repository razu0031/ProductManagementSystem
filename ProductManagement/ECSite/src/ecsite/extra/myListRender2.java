/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsite.extra;

import ecsite.CategoryRow;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author razu
 */
public class myListRender2 implements ListCellRenderer<Object>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        
        CategoryRow categoryRow=new CategoryRow();
        CategoryRow rowValue=(CategoryRow)value;
        
        categoryRow.setScName(rowValue.getScName());
        categoryRow.setDescription(rowValue.getDescription());
        categoryRow.setIcon(rowValue.getIcon());
        
        return categoryRow;
        
    }
    
}

