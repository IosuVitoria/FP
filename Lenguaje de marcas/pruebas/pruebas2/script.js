document.addEventListener('DOMContentLoaded', function () {
    const outputDiv = document.getElementById('output');
    let input = '';

    function clearOutput() {
        input = '';
        updateOutput();
    }

    function appendInput(value) {
        input += value;
        updateOutput();
    }

    function updateOutput() {
        outputDiv.textContent = input;
    }

    function execute() {
        try {
            const result = eval(input);
            input = result.toString();
            updateOutput();
        } catch (error) {
            input = 'Error';
            updateOutput();
        }
    }
});
