/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsite.extra;

import ecsite.AdminLogInForm;

/**
 *
 * @author razu
 */
public class NewClass {
    
    AdminLogInForm n;

    public NewClass() throws Exception {
        this.n = new AdminLogInForm();
    }
    
    
    public static void main(String args[]) throws ClassNotFoundException, Exception {
        AdminLogInForm n2 = new AdminLogInForm();
        n2.setVisible(true);
    }
    
}


