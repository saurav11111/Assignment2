/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

public interface States {
void grantPermission(StateCntxt stc);
void requestPermission(StateCntxt stc);
String getStatus();
}
