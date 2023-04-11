function criptografarTexto(texto) {
  let chave = {
    'e': 'enter',
    'i': 'imes',
    'a': 'ai',
    'o': 'ober',
    'u': 'ufat'
  };
  let textoCriptografado = '';
  for (let i = 0; i < texto.length; i++) {
    if (chave.hasOwnProperty(texto[i])) {
      textoCriptografado += chave[texto[i]];
    } else {
      textoCriptografado += texto[i];
    }
  }
  return textoCriptografado;
}

function descriptografarTexto(textoCriptografado) {
  let chave = {
    'enter': 'e',
    'imes': 'i',
    'ai': 'a',
    'ober': 'o',
    'ufat': 'u'
  };
  let texto = '';
  let palavrasCriptografadas = textoCriptografado.split(' ');
  for (let i = 0; i < palavrasCriptografadas.length; i++) {
    let palavraCriptografada = palavrasCriptografadas[i];
    let palavraDescriptografada = '';
    for (let j = 0; j < palavraCriptografada.length; j += 5) {
      let letraCriptografada = palavraCriptografada.slice(j, j + 5);
      if (chave.hasOwnProperty(letraCriptografada)) {
        palavraDescriptografada += chave[letraCriptografada];
      } else {
        palavraDescriptografada += letraCriptografada;
      }
    }
    texto += palavraDescriptografada + ' ';
  }
  return texto.trim();
}

// Exemplo de uso
let texto = 'gato';
let textoCriptografado = criptografarTexto(texto);
console.log(textoCriptografado); // gaitober

let textoDescriptografado = descriptografarTexto(textoCriptografado);
console.log(textoDescriptografado); // gato
