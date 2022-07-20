package com.pedro.themovieapp.model

class MovieProvider {
    companion object {

        fun random(): MovieModel{
            val position: Int = (0..4).random()
            return movie[position]
        }

        val movie = listOf<MovieModel>(
            MovieModel(
                false,
                "/tsC3DRGAQvkoA88lQQfbQ40byFS.jpg",
                756999,
                "en",
                "The Black Phone",
                "Finney Shaw, a shy but clever 13-year-old boy, is abducted by a sadistic killer and trapped in a soundproof basement where screaming is of little use. When a disconnected phone on the wall begins to ring, Finney discovers that he can hear the voices of the killer’s previous victims. And they are dead set on making sure that what happened to them doesn’t happen to Finney.",
                5992.936,
                "/bxHZpV02OOu9vq3sb3MsOudEnYc.jpg",
                "2022-06-22",
                "The Black Phone",
                false,
                7.8,
                772
            ),
            MovieModel(
                adult = false,
                backdrop_path = "/p1F51Lvj3sMopG948F5HsBbl43C.jpg",
                id = 616037,
                original_language = "en",
                original_title = "Thor: Love and Thunder",
                overview = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now inexplicably wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late.",
                popularity = 3503.056,
                poster_path = "/pIkRyD18kl4FhoCNQuWxWu5cBLM.jpg",
                release_date = "2022-07-08",
                title = "Thor: Love and Thunder",
                video = false,
                vote_average = 6.8,
                vote_count = 1065
            ),
            MovieModel(
                adult = false,
                backdrop_path = "/egoyMDLqCxzjnSrWOz50uLlJWmD.jpg",
                id = 675353,
                original_language = "en",
                original_title = "Sonic the Hedgehog 2",
                overview = "After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations. Sonic teams up with his own sidekick, Tails, and together they embark on a globe-trotting journey to find the emerald before it falls into the wrong hands.",
                popularity = 1654.126,
                poster_path = "/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg",
                release_date = "2022-03-30",
                title = "Sonic the Hedgehog 2",
                video = false,
                vote_average = 7.7,
                vote_count = 2517
            ),
            MovieModel(
                adult = false,
                backdrop_path = "/riyxG4iMQID7GovFPEGI3czQMYz.jpg",
                id = 961484,
                original_language = "en",
                original_title = "Last Seen Alive",
                overview = "After Will Spann's wife suddenly vanishes at a gas station, his desperate search to find her leads him down a dark path that forces him to run from authorities and take the law into his own hands.",
                popularity = 2032.372,
                poster_path = "/qvqyDj34Uivokf4qIvK4bH0m0qF.jpg",
                release_date = "2022-05-19",
                title = "Last Seen Alive",
                video = false,
                vote_average = 6.6,
                vote_count = 135
            ),
            MovieModel(
                adult = false,
                backdrop_path = "/jVGHRpSgtE2MQLJhC5q4lXmPNQW.jpg",
                id = 960258,
                original_language = "en",
                original_title = "Shark Bait",
                overview = "A group of friends enjoying a weekend steal a couple of jetskis racing them out to sea, ending up in a horrific head-on collision. They struggle to find a way home with a badly injured friend while from the waters below predators lurk.",
                popularity = 709.886,
                poster_path = "/mVVU9zC8snNHlcqYONY2HOsh9ob.jpg",
                release_date = "2022-05-13",
                title = "Shark Bait",
                video = false,
                vote_average = 6.5,
                vote_count = 81
            )
        )
    }
}