def call() {
    node {
      sh '''
        git version
        docker version
        echo 'dotnet --list-sdks'
        echo 'dotnet --list-runtimes'
      '''
    }
}