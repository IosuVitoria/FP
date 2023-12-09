const racesVizcaya = [
    {
        "nombre": "Carrera de las Arenas a Bilbao",
        "lugar": "Las Arenas a Bilbao",
        "fecha": "28-01-2024",
        "distancia": "11,9 km",
        "hora_inicio": "10:30 AM",
        "categoria": "Popular",
        "pagina_web": "https://uno.es/carrera-las-arenas-bilbao-2024",
        "imagen": "https://th.bing.com/th/id/OIP.8fynaBex4844hOevXDTYrAHaE8?rs=1&pid=ImgDetMain",
        "descripcion": "Vuela al lado del Nervión desde las Arenas hasta Bilbao.",
        "inscripcion": {
            "precio": 18,
            "fecha_limite": "27-01-2024",
            "enlace": "https://uno.es/carrera-las-arenas-bilbao-2024/individual-registration"
        }
    },
    {
        "nombre": "Kosta trail",
        "lugar": "Sopela",
        "fecha": "Por determinar",
        "distancia": "21km montana, 20km marcha, 7km marcha amiliar",
        "hora_inicio": "Por determinar",
        "categoria": "Pupular-solidaria",
        "pagina_web": "https://kostatrail.com/",
        "imagen": "https://th.bing.com/th/id/OIP.wt-c1YEB7QzmkkQudPotfQHaDJ?rs=1&pid=ImgDetMain",
        "descripcion": "Corre por la costa de Vizcaya en junio gracias a la Kosta-trail. Recorrido completo con vistas al mar Cantábrico.",
        "inscripcion": {
            "precio": 23,
            "fecha_limite": "2023-08-15",
            "enlace": "https://kostatrail.com/"
        }
    },
    {
        "nombre": "Bilbao Mountain Marathon",
        "lugar": "Bilbao",
        "fecha": "Por determinar.",
        "distancia": "13km, 21km y 41km.",
        "hora_inicio": "10:30 AM",
        "categoria": "Popular-trail",
        "pagina_web": "https://www.bilbaomm.com/",
        "imagen": "https://th.bing.com/th/id/R.143fda8654ae7fdc74b13214f2c1eaf7?rik=LrZhH1%2b%2fZchxIg&pid=ImgRaw&r=0",
        "descripcion": "Atrévete con una de las carreras de montaña más exigentes del País Vasco.",
        "inscripcion": {
            "precio": 25,
            "fecha_limite": "Por determinar",
            "enlace": "https://www.bilbaomm.com/"
        }
    },
    {
        "nombre": "Carrera X-Treme de San Antonio Etxebarri",
        "lugar": "Etxebarri",
        "fecha": "03-12-2023",
        "distancia": "35km trail, 10km trail",
        "hora_inicio": "9:30 AM a 11:30AM",
        "categoria": "Popular",
        "pagina_web": "https://www.etxebarrixtreme.com/el-evento/",
        "imagen": "https://th.bing.com/th/id/R.d737aea2e394407a252ab6ed770cdc24?rik=vceR1fffQLbolA&pid=ImgRaw&r=0",
        "descripcion": "Disfruta de una carrera de montaña desde el pueblo de Etxebarri. Desafio increible en su modalidad de 35km.",
        "inscripcion": {
            "precio": 25,
            "fecha_limite": "01-12-23",
            "enlace": "https://www.etxebarrixtreme.com/inscripciones/"
        }
    },
    {
        "nombre": "San Silvestre Bilbao Rekalde",
        "lugar": "Bilbao",
        "fecha": "31-12-23",
        "distancia": "6,6km",
        "hora_inicio": "16:30 PM",
        "categoria": "Nocturna",
        "pagina_web": "https://sansilvestrebilbao.com/wp/",
        "imagen": "https://www.korrikazaleak.com/wp-content/uploads/2022/03/SalidaPrimaveraEdition2021.png",
        "descripcion": "Corre en el final de año por Bilbao. ",
        "inscripcion": {
            "precio": 15.00,
            "fecha_limite": "30-12-2023",
            "enlace": "https://sansilvestrebilbao.com/wp/inscripciones-2023/"
        }
    }
];
const galleryContainer = document.getElementById('race__gallery__vizcaya');

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

racesVizcaya.forEach(race => {
    const raceCard = createRaceCard(race);
    galleryContainer.appendChild(raceCard);
});
