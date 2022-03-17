package src;

import java.util.ArrayList;

public abstract class User {
  private ArrayList<Preference> preferences;

  public void addPreference(Preference preference) {

  }

  public void addPreferences(ArrayList<Preference> preferences) {
    this.preferences = preferences;
  }
}
