package com.plataformas.lab5

data class Event(
    val id: Int,
    val lugar: String,
    val titulo: String,
    val imagenUrl: Int,
    val fechaHora: String,
    val about: String,
    var favorite: Boolean
)

val eventos = listOf(
    Event(
        id = 1,
        lugar = "Parque Central",
        titulo = "Concierto al Aire Libre",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-08-25 18:00",
        about = "Disfruta de un concierto en el parque con varias bandas locales.",
        favorite = false
    ),
    Event(
        id = 2,
        lugar = "Galería de Arte",
        titulo = "Exposición de Arte Moderno",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-09-10 10:00",
        about = "Una colección de obras de arte moderno de artistas locales e internacionales.",
        favorite = true
    ),
    Event(
        id = 3,
        lugar = "Centro Cultural",
        titulo = "Feria de Libros",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-09-15 09:00",
        about = "Una feria de libros con presentaciones de autores y ventas de libros raros.",
        favorite = false
    ),
    Event(
        id=4,
        lugar = "Auditorio Nacional",
        titulo = "Conferencia de Tecnología",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-09-20 11:00",
        about = "Un evento para descubrir las últimas tendencias en tecnología y negocios.",
        favorite = true
    ),
    Event(
        id=5,
        lugar = "Estadio Olímpico",
        titulo = "Partido de Fútbol",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-09-30 19:00",
        about = "Un emocionante partido de fútbol entre los dos mejores equipos de la liga.",
        favorite = false
    ),
    Event(
        id = 6,
        lugar = "Teatro Principal",
        titulo = "Obra de Teatro: Hamlet",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-10-05 20:00",
        about = "Una representación clásica de Hamlet, la famosa obra de Shakespeare.",
        favorite = true
    ),
    Event(
        id = 7,
        lugar = "Museo de Historia",
        titulo = "Taller de Arqueología",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-10-12 14:00",
        about = "Aprende sobre las técnicas y herramientas utilizadas en la arqueología moderna.",
        favorite = false
    ),
    Event(
        id = 8,
        lugar = "Centro de Convenciones",
        titulo = "Festival de Cine Independiente",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-10-18 16:00",
        about = "Una semana de proyecciones de cine independiente de todo el mundo.",
        favorite = true
    ),
    Event(
        id = 9,
        lugar = "Plaza Mayor",
        titulo = "Mercado de Artesanías",
        imagenUrl = R.drawable.ic_launcher_background,
        fechaHora = "2024-10-25 09:00",
        about = "Un mercado con artesanías locales, comida tradicional y música en vivo.",
        favorite = false
    )
)

