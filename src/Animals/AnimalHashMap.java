/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import List.List;
import java.util.HashMap;

/**
 *
 * @author Braya
 */
public class AnimalHashMap implements List<Animal> {
    HashMap<String,Animal> map;

    public AnimalHashMap() {
        this.map = new HashMap();
    }
    
    @Override
    public boolean add(Animal t) {
        if (map.containsKey(t.getId())) return false;
        map.put(t.getId(), t);
        return true;
       
    }

    @Override
    public boolean delete(Animal t) {
        if (!map.containsKey(t.getId())) return false;
        map.remove(t.getId());
        return true;
    }

    @Override
    public Animal find(Object id) {
        String strId = String.valueOf(id);
        return map.get(strId);
    }

    @Override
    public void showall() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
