var arrayNumber = [2,3,4];
var volta = [];
var elementsNumber = [Number.MAX_SAFE_INTEGER];

function Soma(number, total, arrayNumber, volta, cont, auxiliar, elementsNumber) {

    cont++;

    if(total > number || cont > elementsNumber) {
        
    return;
        
    }
    
    for (let i = 0; i < arrayNumber.length; i++) {
    
        Soma(number, total + arrayNumber[i], arrayNumber, volta, cont, [...auxiliar, arrayNumber[i]], elementsNumber);
          
    }
    
    if(total === number){

        volta.push(auxiliar);

    if(cont < elementsNumber[0]) {

        elementsNumber[0] = cont;

    }

    return;

    }

  }

  Soma(10, 0, arrayNumber, volta, 0, [], elementsNumber);

  console.log(volta.filter(el => el.length < elementsNumber[0]));