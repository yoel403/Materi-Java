package tugasKelimaOOP.services;

import java.util.ArrayList;
import java.util.List;

import tugasKelimaOOP.model.Foods;

public class FoodServiceImpl implements Services <Foods, Integer>{
    List<Foods> food1 = new ArrayList<>();

    @Override
    public List<Foods> findAll() {
        // TODO Auto-generated method stub
        return food1;
    }

    @Override
    public Foods findById(Integer id) {
        // TODO Auto-generated method stub
        return food1.get(id-1);
    }

    @Override
    public void save(Foods data) {
        // TODO Auto-generated method stub
        food1.add(data);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        food1.remove(id-1);
    }

    public void menuMakanan(Services<Foods, Integer> data , String pesan) {
    System.out.println(pesan);
        int no = 0;
        for (Foods order : data.findAll()) {
            no++;
            System.out.println(no+ " " + order);
        }
    }
}
