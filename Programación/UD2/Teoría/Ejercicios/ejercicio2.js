const multiplySeven = (num) => {
    for(let i = 0; i<100; i++){
        let med = num + i;
        if(med%7===0){
            console.log(`Hay que sumar ${i} a ${num} para que sea múltiplo de 7`);
            break;
        }
    }
}

multiplySeven(2);
multiplySeven(7);
multiplySeven(100);

