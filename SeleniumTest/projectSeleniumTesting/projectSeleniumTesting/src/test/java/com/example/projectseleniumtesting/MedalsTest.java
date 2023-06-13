package com.example.projectseleniumtesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class MedalsTest {
    @Test
    void medalsTest() {
        Medals medals = new Medals();
        int XXXIIMedals = medals.getTokyoMedals();
        int XMedals = medals.getLAMedals();
        assertTrue(XXXIIMedals < XMedals);
    }
}
