// src/main/resources/static/js/csrf.js

document.addEventListener('DOMContentLoaded', function() {
    var csrfToken = document.querySelector('meta[name="_csrf"]').getAttribute('content');
    var csrfHeader = document.querySelector('meta[name="_csrf_header"]').getAttribute('content');

    document.getElementById('exampleForm').addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent the default form submission

        var data = {
            exampleField: document.getElementById('exampleInput').value
        };

        fetch('/submit', {
            method: 'POST',
            headers: {
                [csrfHeader]: csrfToken,
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        })
            .then(response => response.json())
            .then(data => console.log(data))
            .catch(error => console.error('Error:', error));
    });
});
