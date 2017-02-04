/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsite;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author razu
 */

/*
-- ProductName@
-- ProductPicture@
-- Discount@
-- UnitWeight@
-- UnitPrice@
-- ProductDescription@
*/
public class ProductsListRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        
            
        ProductRow rowValue=(ProductRow)value;
        String txt="<html>Name  : " + rowValue.getProductName() + " .<br/>Price : " +rowValue.getUnitPrice()
                  +" TK.<br/>Discount : "+rowValue.getDoscount()+" %.<br/>Final Price : "+rowValue.getFinalPrice()
                  +" TK.<br/>Description : " + rowValue.getProductDescription();
        setText(txt);
        setIcon(rowValue.getIcon());
        
        setIconTextGap(55);
        setBorder(BorderFactory.createTitledBorder(""));
        setFont(new Font("Tahoma", 0, 15));
        setForeground(new Color(240, 240, 240));
        setBackground(isSelected || cellHasFocus ? new Color(0, 102, 102) : new Color(0, 153, 153));
        //setBackground(new Color(0, 153, 153));
        
        setEnabled(true);
        return this;
        
    }
}
