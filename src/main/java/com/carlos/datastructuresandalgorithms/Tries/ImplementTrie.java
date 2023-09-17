package com.carlos.datastructuresandalgorithms.Tries;

import java.util.ArrayList;

class ImplementTrie {
    ArrayList<String> list = new ArrayList<>();

    public ImplementTrie() {}

    public void insert(String word) {
        list.add(word);
    }

    public boolean search(String word) {
        return list.contains(word);

    }

    public boolean startsWith(String prefix) {
        boolean response = false;
        for(String word : list) {
            if(word.startsWith(prefix)) {
                response = true;
            }
        }
        return response;
    }
}