package com.plataformas.lab5

data class Event(
    val id: Int,
    val lugar: String,
    val titulo: String,
    val imagenUrl: String,
    val fechaHora: String,
    val about: String,
    var favorite: Boolean
)

val eventos = listOf(
    Event(
        id = 1,
        lugar = "Parque Central",
        titulo = "Concierto al Aire Libre",
        imagenUrl = "https://example.com/concierto.jpg",
        fechaHora = "2024-08-25 18:00",
        about = "Disfruta de un concierto en el parque con varias bandas locales.",
        favorite = false
    ),
    Event(
        id = 2,
        lugar = "Galería de Arte",
        titulo = "Exposición de Arte Moderno",
        imagenUrl = "https://example.com/arte.jpg",
        fechaHora = "2024-09-10 10:00",
        about = "Una colección de obras de arte moderno de artistas locales e internacionales.",
        favorite = true
    ),
    Event(
        id = 3,
        lugar = "Centro Cultural",
        titulo = "Feria de Libros",
        imagenUrl = "https://example.com/libros.jpg",
        fechaHora = "2024-09-15 09:00",
        about = "Una feria de libros con presentaciones de autores y ventas de libros raros.",
        favorite = false
    ),
    Event(
        id=4,
        lugar = "Auditorio Nacional",
        titulo = "Conferencia de Tecnología",
        imagenUrl = "https://example.com/tecnologia.jpg",
        fechaHora = "2024-09-20 11:00",
        about = "Un evento para descubrir las últimas tendencias en tecnología y negocios.",
        favorite = true
    ),
    Event(
        id=5,
        lugar = "Estadio Olímpico",
        titulo = "Partido de Fútbol",
        imagenUrl = "https://example.com/futbol.jpg",
        fechaHora = "2024-09-30 19:00",
        about = "Un emocionante partido de fútbol entre los dos mejores equipos de la liga.",
        favorite = false
    ),
    Event(
        id = 6,
        lugar = "Teatro Principal",
        titulo = "Obra de Teatro: Hamlet",
        imagenUrl = "https://example.com/teatro.jpg",
        fechaHora = "2024-10-05 20:00",
        about = "Una representación clásica de Hamlet, la famosa obra de Shakespeare.",
        favorite = true
    ),
    Event(
        id = 7,
        lugar = "Museo de Historia",
        titulo = "Taller de Arqueología",
        imagenUrl = "https://example.com/arqueologia.jpg",
        fechaHora = "2024-10-12 14:00",
        about = "Aprende sobre las técnicas y herramientas utilizadas en la arqueología moderna.",
        favorite = false
    ),
    Event(
        id = 8,
        lugar = "Centro de Convenciones",
        titulo = "Festival de Cine Independiente",
        imagenUrl = "https://example.com/cine.jpg",
        fechaHora = "2024-10-18 16:00",
        about = "Una semana de proyecciones de cine independiente de todo el mundo.",
        favorite = true
    ),
    Event(
        id = 9,
        lugar = "Plaza Mayor",
        titulo = "Mercado de Artesanías",
        imagenUrl = "https://example.com/artesanias.jpg",
        fechaHora = "2024-10-25 09:00",
        about = "Un mercado con artesanías locales, comida tradicional y música en vivo.",
        favorite = false
    )
)

