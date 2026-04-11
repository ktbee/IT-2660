class Main {
  public static void main(String[] args) {
    // Create a map valled creditHours
    MyMap<String, Integer> creditHours = new MyHashMap<>();

    // Add entries to creditHours
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    // Check for entries by key
    System.out.println("IT-1025 is in the HashMap: " + creditHours.containsKey("IT-1025"));
    System.out.println("IT-2110 is in the HashMap: " + creditHours.containsKey("IT-2110"));

    // Print HashMap values
    System.out.println("Current values in the HashMap: " + creditHours.toString());

    // Remove certain entries
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // Re-print HashMap values
    System.out.println("HashMap after removing IT-2030 and IT-1150: " + creditHours.toString());
  }
}
