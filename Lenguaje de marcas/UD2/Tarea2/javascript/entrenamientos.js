function showTraining(distance) {
    // Se ocultan los planes de entrenamiento para poder empezar de 0. La persona usuaria elige lo que va  a ver.
    let trainingContainers = document.getElementsByClassName('distance-training');
    for (var i = 0; i < trainingContainers.length; i++) {
        trainingContainers[i].style.display = 'none';
    }

    // Mostrar el plan de entrenamiento seleccionado. Se cambia el display none a display block para que muestre.
    let selectedTraining = document.getElementById(distance);
    if (selectedTraining) {
        selectedTraining.style.display = 'block';
    }
}