function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word
    const reversedWords = words.map(reverseWord);

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    return word.split('').reverse().join('');
}

// Example usage:
const inputSentence = 'This is a sunny day';
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log('Reversed sentence:', reversedSentence);
