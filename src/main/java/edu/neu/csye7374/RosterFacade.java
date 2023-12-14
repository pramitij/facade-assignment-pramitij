package edu.neu.csye7374;

import java.util.List;

public class RosterFacade {
    private RosterAPI<Student> rosterAPI;
    private String filePath;

    public RosterFacade(RosterAPI<Student> rosterAPI, String filePath) {
        this.rosterAPI = rosterAPI;
        this.filePath = filePath;
    }

    public void saveRoster(List<Student> roster) {
        rosterAPI.openRoster(filePath);
        rosterAPI.writeRoster(roster);
        rosterAPI.closeRoster();
    }

    public List<Student> loadRoster() {
        rosterAPI.openRoster(filePath);
        List<Student> roster = rosterAPI.readRoster();
        rosterAPI.closeRoster();
        return roster;
    }
}
