const racesAlava = [
    {
        "nombre": "Total Energies Maratón Vitoria-Gasteiz Martín Fiz",
        "lugar": "Vitoria Gasteiz",
        "fecha": "2023-07-15",
        "distancia": "10, 21, 42 km",
        "hora_inicio": "8:30 AM",
        "categoria": "Popular",
        "pagina_web": "https://www.maratonmartinfiz.com/",
        "imagen": "https://th.bing.com/th/id/OIP.1IsRgI0zAAkA_j_LXDj2owHaE3?rs=1&pid=ImgDetMain",
        "descripcion": "Carrera rápida por Vitoria-Gasteiz saliendo desde Mendizorrotza y haciendo la Avenida Gasteiz y Avenida del Zadorra entre otras calles de la ciudad.",
        "inscripcion": {
            "precio": 23,
            "fecha_limite": "30-4-2023. Consultar precios en web",
            "enlace": "https://www.maratonmartinfiz.com/"
        }
    },
    {
        "nombre": "Subida a Estíbaliz",
        "lugar": "Vitoria",
        "fecha": "Por determinar",
        "distancia": "15 km",
        "hora_inicio": "10:30 AM normalmente",
        "categoria": "Popular",
        "pagina_web": "http://manueliradier.com/ve/ve2023/ve2023.htm",
        "imagen": "https://i.ytimg.com/vi/X0mZtSjLKaY/maxresdefault.jpg",
        "descripcion": "¡Desafía tus límites con la subida a Estibaliz! Un recorrido por las vías del antiguo tren vasco-navarro.",
        "inscripcion": {
            "precio": 23,
            "fecha_limite": "Por determinar",
            "enlace": "http://manueliradier.com/"
        }
    },
    {
        "nombre": "Media Maratón de Vitoria-Gasteiz",
        "lugar": "Vitoria-Gasteiz",
        "fecha": "2023-08-20",
        "distancia": "21 km",
        "hora_inicio": "10:30 AM",
        "categoria": "Competitiva",
        "pagina_web": "https://www.mediamaratonvitoriagasteiz.com/index_media.php",
        "imagen": "https://mediamaratonvitoriagasteiz.com/imagenes/noticias/20211219163822/20211219163822_0.jpg",
        "descripcion": "Prueba la media de la ciudad. Un recorrido que lleva por toda la ciudad con salida y llegada en Mendizorrotza",
        "inscripcion": {
            "precio": 25,
            "fecha_limite": "2023-12-23",
            "enlace": "https://www.mediamaratonvitoriagasteiz.com"
        }
    },
    {
        "nombre": "Vitoria-Gasteiz Trail",
        "lugar": "Vitoria-Gasteiz",
        "fecha": "Por determinar",
        "distancia": "16km -26km",
        "hora_inicio": "10:00 AM",
        "categoria": "Popular",
        "pagina_web": "http://www.vitoriatrail.com/",
        "imagen": "https://th.bing.com/th/id/OIP.5bB9WePH_tw4di1mC5CJ1AHaE4?rs=1&pid=ImgDetMain",
        "descripcion": "Disfruta de la subida a Zaldiaran y sumérgete en el verde. Un recorrido que pone a prueba tanto a novatos como expertos.",
        "inscripcion": {
            "precio": 25,
            "fecha_limite": "Por determinar",
            "enlace": "http://www.vitoriatrail.com/"
        }
    },
    {
        "nombre": "Carrera San Silvestre Vitoria-Gasteiz",
        "lugar": "Vitoria-Gasteiz",
        "fecha": "2023-12-31",
        "distancia": "6,4 km",
        "hora_inicio": "12:30 PM",
        "categoria": "Popular",
        "pagina_web": "https://www.vitoria-gasteiz.org/wb021/was/contenidoAction.do?idioma=es&uid=u4c990bc4_18bb64ec37d_2c76",
        "imagen": "https://static2.elcorreo.com/www/multimedia/201812/30/media/cortadas/ss-k7FB-U70112119374LAB-624x385@El%20Correo.jpg",
        "descripcion": "Carrera multitudinaria y solidaria por Vitoria. Rápida y perfecta para cualquier tipo de corredora o corredor.",
        "inscripcion": {
            "precio": 5.00,
            "fecha_limite": "31-12-23",
            "enlace": "https://www.vitoria-gasteiz.org/wb021/was/contenidoAction.do?idioma=es&uid=u4c990bc4_18bb64ec37d_2c76"
        }
    }
];
const galleryAlava = document.getElementById('race__gallery__alava');

function createRaceCard(race) {
    const raceCard = document.createElement('div');
    raceCard.className = 'race-card';

    const raceImage = document.createElement('img');
    raceImage.src = race.imagen;
    raceImage.alt = race.nombre;
    raceImage.className = 'race-image';

    const raceDetails = document.createElement('div');
    raceDetails.className = 'race-details';

    const raceTitle = document.createElement('h2');
    raceTitle.textContent = race.nombre;

    const briefInfo = document.createElement('p');
    briefInfo.innerHTML = `<b>Lugar:</b> ${race.lugar}<br><b>Fecha:</b> ${race.fecha}<br><b>Distancia:</b> ${race.distancia}<br></br>`;

    const fullInfo = document.createElement('div');
    fullInfo.className = 'full-info';
    fullInfo.innerHTML = `<b>Hora de inicio:</b> ${race.hora_inicio}<br><b>Categoría:</b> ${race.categoria}<br><b>Descripción:</b> ${race.descripcion}<br><b>Precio de inscripción:</b> ${race.inscripcion.precio.toFixed(2)}€<br><b>Fecha límite de inscripción:</b> ${race.inscripcion.fecha_limite}<br><b>Enlace de inscripción:</b> <a href="${race.inscripcion.enlace}" target="_blank">${race.inscripcion.enlace}</a>`;

    const seeMoreButton = document.createElement('button');
    seeMoreButton.textContent = 'Ver más';
    seeMoreButton.addEventListener('click', () => {
        raceDetails.classList.add('expanded');
        seeMoreButton.style.display = 'none';
        backButton.style.display = 'block';
    });

    const backButton = document.createElement('button');
    backButton.textContent = 'Volver';
    backButton.style.display = 'none';
    backButton.addEventListener('click', () => {
        raceDetails.classList.remove('expanded');
        backButton.style.display = 'none';
        seeMoreButton.style.display = 'block';
    });

    raceDetails.appendChild(raceTitle);
    raceDetails.appendChild(briefInfo);
    raceDetails.appendChild(fullInfo);
    raceDetails.appendChild(backButton);

    raceCard.appendChild(raceImage);
    raceCard.appendChild(raceDetails);
    raceCard.appendChild(seeMoreButton);

    return raceCard;
}

racesAlava.forEach(race => {
    const raceCard = createRaceCard(race);
    galleryAlava.appendChild(raceCard);
});
