package edu.neu.csye7374;

import java.util.List;

public interface RosterAPI<T> {
    void openRoster(String filePath);
    List<T> readRoster();
    void writeRoster(List<T> data);
    void closeRoster();
}
