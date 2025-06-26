/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import List.List;



/**
 *
 * @author Braya 
 */
public class Visitors_List implements List<Visitor> {
    private Visitor Visits[];
    
    public Visitors_List() {
        this.Visits = new Visitor[100];
    }
            
    @Override
    public boolean add(Visitor t) {
        int max = Visits.length;
        for (int i = 0; i < max; i++) {
            if(Visits[i]==null){
                Visits[i]=t;
                return true;
            }
        }
        return false;
     
    }

    @Override
    public boolean delete(Visitor t) {
        int max = Visits.length;
        for (int i = 0; i < max; i++) {
            if(Visits[i]==t){
                Visits[i]=null;
                return true;
            }
            
        }
        return false;
    }

    @Override
    public Visitor find(Object id) {
        int max = Visits.length;
        for (int i = 0; i < max; i++) {
            if(Visits[i].getId().equals(id.toString())){
                return Visits[i];
            }
        }
        return null;
    }

    @Override
    public void showall() {
       int max = Visits.length;
        for (int i = 0; i < max; i++) {
            if(Visits[i]!=null){
                Visits.toString();
            }
        }
    }
    
}
