package com.example.datastructuresandalgorithms;

import arraysAndHashing.ContainsDuplicates;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        ContainsDuplicates c = new ContainsDuplicates();
        System.out.println(c.containsDuplicate(nums));
        System.out.println("hello world");
        System.out.println("hello worghjkld");

    }
}