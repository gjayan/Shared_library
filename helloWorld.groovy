def salutation(String name, String dayOfWeek) {
    // sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
  sh "echo Hello ${name}. Today is ${dayOfWeek}."
}
