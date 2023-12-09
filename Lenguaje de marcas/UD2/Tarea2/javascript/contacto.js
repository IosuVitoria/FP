function toggleLanguage() {
    var langElements = document.querySelectorAll('[data-lang]');
    langElements.forEach(function (element) {
        var langKey = element.getAttribute('data-lang');
        element.innerHTML = languages[currentLang][langKey];
    });

    currentLang = (currentLang === 'en') ? 'es' : 'en';
}


var languages = {
    'en': {
        'headerTitle': 'RUNNERLAND',
        'followUs': 'FOLLOW US ON SOCIAL MEDIA',
        'footerAddress': '<b>Address:</b> 123 Running Street, Vitoria-Gasteiz, Álava',
        'footerPhone': '<b>Phone:</b> +34 123 456 789',
        'footerEmail': '<b>Email:</b> runnerland2023@gmail.com',
        'footerCopyright': '&copy; 2023 Runnerland | All rights reserved',
        'contactHeader': 'Contact',
        'contactName': 'Name:',
        'contactEmail': 'Email:',
        'contactMessage': 'Message:',
        'contactButton': 'Send'
    },
    'es': {
        'headerTitle': 'RUNNERLAND',
        'followUs': 'SÍGUENOS EN NUESTRAS REDES SOCIALES',
        'footerAddress': '<b>Dirección:</b> Calle Martín Fiz Nº 12 Bajo, Vitoria-Gasteiz, Álava-Araba',
        'footerPhone': '<b>Teléfono:</b> +34 945 058 289',
        'footerEmail': '<b>Email:</b> runnerland2023@gmail.com',
        'footerCopyright': '&copy; 2023 Runnerland | Todos los derechos reservados',
        'contactHeader': 'Contacto',
        'contactName': 'Nombre:',
        'contactEmail': 'Email:',
        'contactMessage': 'Mensaje:',
        'contactButton': 'Enviar'
    }
};

var currentLang = 'es'; 


function sendEmail() {
    var params = {
        to_name: "Equipo de Runnerland",
        from_name: document.getElementById("nombre").value,
        // from_email: document.getElementById("email").value,
        message: document.getElementById("mensaje").value
    };

    console.log(params)
  
    const serviceID = "service_llr5kqw";
    const templateID = "template_fjlq19g";
    
  
    emailjs.send(serviceID, templateID, params)
      .then(res=>{
          document.getElementById("name").value = "";
          document.getElementById("email").value = "";
          document.getElementById("message").value = "";
          console.log(res);
          alert("Se ha enviado el mensaje con éxito.")
  
      })
      .catch(err=>console.log(err));
  
  }