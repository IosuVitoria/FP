const racesGuipuzcoa = [
    {
        "nombre": "Media Maratón de Irún 2024",
        "lugar": "Irún",
        "fecha": "25-02-2024",
        "distancia": "10km, 21km",
        "hora_inicio": "10:30 AM",
        "categoria": "Popular",
        "pagina_web": "https://www.mediamaratonirun.com/",
        "imagen": "https://s1.ppllstatics.com/diariovasco/www/multimedia/202202/03/media/cortadas/71118273-keLI--1248x770@Diario%20Vasco.JPG",
        "descripcion": "Carrera por Irún. Conoce la localidad por donde pasa también la Behobia San Sebastian.",
        "inscripcion": {
            "precio": 25,
            "fecha_limite": "20-02-24. Consultar todos los precios en la web.",
            "enlace": "https://www.mediamaratonirun.com/"
        }
    },
    {
        "nombre": "Media Maratón Donostia 2024",
        "lugar": "Donosti-San Sebastian",
        "fecha": "07-04-2024",
        "distancia": "10km, 21km ",
        "hora_inicio": "10:00 AM",
        "categoria": "Competitiva - popular",
        "pagina_web": "https://www.mediadonosti.com/",
        "imagen": "https://th.bing.com/th/id/R.d583b72e6d6f9a40a46a5f16e1134cea?rik=NwnVPqyqM6ikOA&pid=ImgRaw&r=0",
        "descripcion": "Una de las carreras más rápidas que se pueden hacer en Euskadi. Dos vueltas a un circuito por la ciudad si haces 21km y una sola si haces 10 km.",
        "inscripcion": {
            "precio": 25,
            "fecha_limite": "02-04-24",
            "enlace": "https://www.rockthesport.com/es/evento/media-maraton-san-sebastian-2024/inscripcion/selecciona-tarifa"
        }
    },
    {
        "nombre": "Zurich Medio Maratón internacional de San Sebastian",
        "lugar": "Donosti-San Sebastian",
        "fecha": "06-10-2024",
        "distancia": "21 km",
        "hora_inicio": "10:00 AM",
        "categoria": "Competitiva - popular",
        "pagina_web": "https://www.zurichmediomaratonsansebastian.com/es",
        "imagen": "https://running.es/wp-content/uploads/2022/07/Zurich-Maraton-San-Sebastian-2-768x512.jpg",
        "descripcion": "La época del año, la carrera y la animación hacen de este día una ocasión perfecta para superar records personales.",
        "inscripcion": {
            "precio": 28,
            "fecha_limite": "23-09-2024",
            "enlace": "https://inscripciones.mediomaratonsansebastian.com/es"
        }
    },
    {
        "nombre": "27º Clásica Salto 15k Donostia San Sebastian 2024 ",
        "lugar": "Donostia",
        "fecha": "27-10-2024",
        "distancia": "15km",
        "hora_inicio": "10:00 AM",
        "categoria": "Popular",
        "pagina_web": "https://15ksansebastian.com/",
        "imagen": "https://th.bing.com/th/id/OIP.8GbkKUPk-MRw3WJo3ys_OwHaE8?rs=1&pid=ImgDetMain",
        "descripcion": "Circuito llano que discurre por los lugares más turísticos de San Sebastián LLegada en el miniestadio de Anoeta.",
        "inscripcion": {
            "precio": 25,
            "fecha_limite": "Por determinar",
            "enlace": "https://inscripciones.rpmsports.es/es/evento/salto-15k-donostia-san-sebastian23/inscripcion/selecciona-tarifa"
        }
    },
    {
        "nombre": "Behobia San Sebastian 2024",
        "lugar": "Behobia - Donosti ",
        "fecha": "10-11-2024",
        "distancia": "20 km",
        "hora_inicio": "Desde las 9:00 AM",
        "categoria": "Popular",
        "pagina_web": "https://www.behobia-sansebastian.com/es/index.php",
        "imagen": "https://imagenes.diariodenavarra.es/files/gallery_mobile_filter/uploads/2023/11/12/6550b0b8ebc25.jpeg",
        "descripcion": "Carrera multitudinaria y increíble para los corredores. Una experiencia que es mejor vivir que contar.",
        "inscripcion": {
            "precio": 50,
            "fecha_limite": "Fin de dorsales",
            "enlace": "https://www.behobia-sansebastian.com/es/inscripciones/calendario"
        }
    }
];
const galleryGuipuzcoa = document.getElementById('race__gallery__guipuzcoa');

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

racesGuipuzcoa.forEach(race => {
    const raceCard = createRaceCard(race);
    galleryGuipuzcoa.appendChild(raceCard);
});
