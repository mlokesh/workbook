function ToDoController($scope) {
    $scope.todos = [];
    $scope.remaining = 0;
    $scope.complete = 0;

    $scope.addToDo = function() {
        $scope.todos.unshift({text:$scope.todoText, done:false})
        $scope.todoText='';
        updateState()
    }

    $scope.remove = function(index) {
        $scope.todos.splice(index, 1);
        updateState()
    }

    $scope.markdone = function(index) {
        $scope.todos[index].done = !$scope.todos[index].done;
        updateState()
    }

    $scope.getClazz = function(index) {
        if ($scope.todos[index].done) {
            return 'done'
        }
        return ''
    }

    function updateState() {
        console.log('update state')
        $scope.remaining = $scope.todos.filter(function(e) {return !e.done}).length
        $scope.complete = $scope.todos.filter(function(e) {return e.done}).length
        console.log($scope)
    }

}