package org.example;

import java.util.*;

public class Solution {
    public boolean solution(int[] A, int[] B, int S) {
        // Basic input validation
        if (A == null || B == null || A.length != B.length || S <= 0) return false;
        int numPatients = A.length;

        // If any patient has identical preferences, return false
        for (int i = 0; i < numPatients; i++) {
            if (A[i] == B[i]) return false;
        }

        // Map each slot to the patient assigned (-1 means unassigned)
        int[] slotAssignment = new int[S + 1];
        Arrays.fill(slotAssignment, -1);

        // Build each patient's list of valid slot preferences
        List<List<Integer>> patientPreferences = new ArrayList<>(numPatients);
        for (int i = 0; i < numPatients; i++) {
            List<Integer> slots = new ArrayList<>(2);
            if (isValidSlot(A[i], S)) slots.add(A[i]);
            if (isValidSlot(B[i], S) && B[i] != A[i]) slots.add(B[i]);
            if (slots.isEmpty()) return false;
            patientPreferences.add(slots);
        }

        // Try to assign each patient to a slot using DFS-based matching
        for (int patient = 0; patient < numPatients; patient++) {
            boolean[] visitedSlots = new boolean[S + 1];
            if (!assignSlot(patient, patientPreferences, slotAssignment, visitedSlots)) {
                return false;
            }
        }
        return true;
    }

    // Helper to check if a slot number is valid
    private boolean isValidSlot(int slot, int maxSlot) {
        return slot >= 1 && slot <= maxSlot;
    }

    // DFS-based matching: try to assign a slot to the patient
    private boolean assignSlot(int patient, List<List<Integer>> preferences, int[] slotAssignment, boolean[] visitedSlots) {
        for (int slot : preferences.get(patient)) {
            if (visitedSlots[slot]) continue;
            visitedSlots[slot] = true;

            // If slot is free or previous patient can be reassigned
            if (slotAssignment[slot] == -1 || assignSlot(slotAssignment[slot], preferences, slotAssignment, visitedSlots)) {
                slotAssignment[slot] = patient;
                return true;
            }
        }
        return false;
    }
}