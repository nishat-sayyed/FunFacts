package com.example.nishat.funfacts;

import java.util.Random;

/**
 * Created by Nishat on 3/11/2017.
 */

public class FactBook {

    String[] facts = {
            "Ants stretch when they wake in morning.",
            "Banging your head against a wall burns 150 calories an hour.",
            "Pteronophobia is the fear of being tickled by feathers!",
            "Bananas are curved because they grow towards the sun.",
            "Movie trailers were originally shown after the movie, which is why they were called “trailers”.",
            "There’s volcano in Indonesia that spews blue lava.",
            "Receiving a text message which says, “”can I ask you a question” is known to scare 99% of people!",
            "Bird poop is white because they don’t pee.",
            "First law of cartoon physics: gravity doesn’t work until you look down.",
            "After reading this fact you will not recognize that the the brain doesn’t recognize the second ‘the’.",
            "Every human being starts out as an asshole: it’s the first part of the body to form in the womb.",
            "Blue flames are hotter than red flames.",
            "You recall memories better with your eyes closed.",
            "Hippopotamus milk is pink.",
            "Men are more likely to say “I Love you” first than women are.",
            "The world consumes close to 2.25 billion cups of coffee every day.",
            "A lemon contains more sugar than a strawberry.",
            "Some snakes survive for two years without a meal.",
            "Some fish, like triggerfish, can swim backwards.",
            "Cows have distinct accents in their mooing, depending on where they are from.",
            "Leonardo Da Vinci was the first to explain why the sky is blue.",
            "Barbie’s full name is Barbara Millicent Roberts.",
            "Male kangaroos flex their biceps to impress females.",
            "Your skull is made up of 29 different bones.",
            "An octopus has three hearts.",
            "A jellyfish is approximately 95% water.",
            "Wrapping rubber bands around the ends of hangers can prevent clothes from slipping off.",
            "People are more likely to make good decisions when they need to urinate.",
            "Samsung means “three stars” in Korean.",
            "The tongue is the only muscle in the body only connected at one end."
    };
    public String getFact(){
        Random random = new Random();
        int randomNumber = random.nextInt(facts.length);
        return facts[randomNumber];
    }
}
