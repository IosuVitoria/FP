//Modificar el ejercicio anterior para que indicando dos números n y m, nos diga qué cantidad hay que sumarle a n para que sea múltiplo de m.

// const multiplySeven = (num) => {
//     for(let i = 0; i<100; i++){
//         let med = num + i;
//         if(med%7===0){
//             console.log(`Hay que sumar ${i} a ${num} para que sea múltiplo de 7`);
//             break;
//         }
//     }
// }

const multiplier = (num, div) => {
    for(let i = 0; i<100; i++){
        let med = num + i;
        if(med%div===0){
            console.log(`Hay que sumar ${i} a ${num} para que sea múltiplo de ${div}`);
            break;
        }
    }
}

multiplier(34, 16);
multiplier(39, 45);
multiplier(3, 6);