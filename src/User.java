package src;

import java.util.ArrayList;

public abstract class User {
  private ArrayList<Preferences> preferences;

  public void addPreference(Preferences preference) {

  }

  public void addPreferences(ArrayList<Preferences> preferences) {
    this.preferences = preferences;
  }
}
