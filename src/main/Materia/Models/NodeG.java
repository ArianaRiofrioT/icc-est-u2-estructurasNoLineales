package main.Materia.Models;

import java.util.ArrayList;
import java.util.List;

public class NodeG {
    int value;
    List<NodeG> neighbors; 

    public NodeG(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
}
