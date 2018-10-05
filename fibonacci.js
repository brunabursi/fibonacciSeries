let readline = require('readline-sync');

let j = readline.question('insira um número');

let serieFib = function fibonacci (n){
    if(n<=1){ 
        
        return [0, 1]
    }else{

        let serie = serieFib(n-1);
        serie.push(serie[serie.length-1]+serie[serie.length-2]);
        return serie;

    }
}



console.log(serieFib(j));