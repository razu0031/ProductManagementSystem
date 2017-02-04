/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsite;

import javax.swing.Icon;

/**
 *
 * @author razu
 */
public class Cr {
    
    String scName;
    String description;
    Icon  icon;
    String imageLink;

    public Cr(String scName, Icon icon) {
        this.scName = scName;
        this.icon = icon;
    }

    public Cr(String scName, String description, Icon icon) {
        this.scName = scName;
        this.description = description;
        this.icon = icon;
    }

    public Cr(String scName, String description, String imageLink) {
        this.scName = scName;
        this.description = description;
        this.imageLink = imageLink;
    }

    public Cr(String scName, String description, Icon icon, String imageLink) {
        this.scName = scName;
        this.description = description;
        this.icon = icon;
        this.imageLink = imageLink;
    }
    
    

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
    
    
}
