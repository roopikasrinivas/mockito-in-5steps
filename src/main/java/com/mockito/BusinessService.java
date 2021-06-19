package com.mockito;

public class BusinessService {

    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatest(){
        int[] data = dataService.getData();
        int greatest = Integer.MIN_VALUE;
        for(int value : data){
            greatest = (value > greatest) ? value :  greatest;
        }
        return greatest;
    }
}